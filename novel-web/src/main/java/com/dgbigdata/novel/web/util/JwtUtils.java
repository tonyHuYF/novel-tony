package com.dgbigdata.novel.web.util;

import cn.hutool.core.util.ObjectUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

/**
 * JWT 工具类
 */
@ConditionalOnProperty("novel.jwt.secret")
@Component
@Slf4j
public class JwtUtils {

    /**
     * 注入JWT加密密钥
     */
    @Value("${novel.jwt.secret}")
    private String secret;

    /**
     * 定义系统标识头常量
     */
    private static final String HEADER_SYSTEM_KEY = "systemKeyHeader";

    /**
     * 根据用户ID生成JWT
     */
    public String generateToken(String userId, String systemKey) {
        return Jwts.builder()
                .setHeaderParam(HEADER_SYSTEM_KEY, systemKey)
                .setSubject(userId)
                .signWith(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
                .compact();
    }

    /**
     * 解析JWT返回用户ID
     */
    public String parseToken(String token, String systemKey) {
        Jws<Claims> claimsJws;
        try {
            claimsJws = Jwts.parserBuilder()
                    .setSigningKey(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
                    .build()
                    .parseClaimsJws(token);
            //ok, 我们可以相信这个 jwt
            //判断该 jwt 是否属于指定系统
            if (ObjectUtil.equals(claimsJws.getHeader().get(HEADER_SYSTEM_KEY), systemKey)) {
                return claimsJws.getBody().getSubject();
            }
        } catch (JwtException e) {
            log.warn("JWT解析失败: {}", token);
            //我们不能相信这个 jwt
        }
        return null;
    }

}
