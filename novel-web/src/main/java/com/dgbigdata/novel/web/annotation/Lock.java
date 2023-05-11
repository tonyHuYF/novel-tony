package com.dgbigdata.novel.web.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 分布式锁 Lock注解
 */
@Documented
@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface Lock {

    String prefix();

    boolean isWait() default false;

    long waitTime() default 3L;
}
