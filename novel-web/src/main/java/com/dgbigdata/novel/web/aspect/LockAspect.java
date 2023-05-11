package com.dgbigdata.novel.web.aspect;

import cn.hutool.core.util.StrUtil;
import com.dgbigdata.common.api.domain.CommonException;
import com.dgbigdata.novel.web.annotation.Key;
import com.dgbigdata.novel.web.annotation.Lock;
import com.dgbigdata.novel.web.domain.BusinessError;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.concurrent.TimeUnit;

/**
 * 分布锁 切面
 */
@Component
@Aspect
@RequiredArgsConstructor
public class LockAspect {

    private final RedissonClient redissonClient;

    private static final String KEY_PREFIX = "Lock";

    private static final String KEY_SEPARATOR = "::";


    @Pointcut("@annotation(com.dgbigdata.novel.web.annotation.Lock)")
    public void pt() {

    }

    @Around("pt()")
    @SneakyThrows
    public Object doAround(ProceedingJoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method targetMethod = methodSignature.getMethod();
        Lock lock = targetMethod.getAnnotation(Lock.class);
        String lockKey = KEY_PREFIX + buildLockKey(lock.prefix(), targetMethod, joinPoint.getArgs());
        RLock rLock = redissonClient.getLock(lockKey);
        if (lock.isWait() ? rLock.tryLock(lock.waitTime(), TimeUnit.SECONDS) : rLock.tryLock()) {
            try {
                return joinPoint.proceed();
            } finally {
                if(rLock.isLocked() && rLock.isHeldByCurrentThread()){
                    rLock.unlock();
                }
            }
        }
        throw new CommonException(BusinessError.SERVICE_ERROR);
    }


    private String buildLockKey(String prefix, Method method, Object[] args) {
        StringBuilder sb = new StringBuilder();
        if (StrUtil.isNotBlank(prefix)) {
            sb.append(KEY_SEPARATOR).append(prefix);
        }
        Parameter[] parameters = method.getParameters();
        for (int i = 0; i < parameters.length; i++) {
            sb.append(KEY_SEPARATOR);
            if (parameters[i].isAnnotationPresent(Key.class)) {
                Key key = parameters[i].getAnnotation(Key.class);
                sb.append(parseKeyExpr(key.expr(), args[i]));
            }
        }
        return sb.toString();

    }


    private String parseKeyExpr(String expr, Object arg) {
        if (StrUtil.isBlank(expr)) {
            return arg.toString();
        }
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression(expr, new TemplateParserContext());
        return expression.getValue(arg, String.class);
    }


}
