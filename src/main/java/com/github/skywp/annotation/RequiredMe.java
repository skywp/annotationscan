package com.github.skywp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version V1.0
 * @Title: RequiredMe
 * @Package com.github.skywp.annotation
 * @Description: 使用注解反射的方式来校验字段
 * @author: WangPeng
 * @date: 2018/11/1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface RequiredMe {
    public String value() default "";
}
