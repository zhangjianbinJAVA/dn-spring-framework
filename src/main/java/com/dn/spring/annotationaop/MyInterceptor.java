package com.dn.spring.annotationaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 注解方式 aop
 */
//@Component
//@Aspect
public class MyInterceptor {

    @Pointcut("execution(public * com.dn.spring.service..*.*(..))")
    public void myMethod() {

    }

    @Before("myMethod()")
    public void before() {
        System.out.println("annotation前置通知");
    }
}
