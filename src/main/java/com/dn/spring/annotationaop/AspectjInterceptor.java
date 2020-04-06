package com.dn.spring.annotationaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 注解方式 aop ,切面类
 */
@Component
@Aspect
public class AspectjInterceptor {

    @Pointcut("execution(public * com.dn.spring.service.MyServiceImp2.*(..))")
    public void myMethod() {

    }

    @Before("myMethod()")
    public void before() {
        System.out.println("annotation前置通知");
    }

    @After("myMethod()")
    public void after() {
        System.out.println(" after annotation后置通知");
    }

    @Around("myMethod()")
    public void around(ProceedingJoinPoint point) {
        System.out.println("around annotation前置通知");
        try {
            point.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around annotation后置通知");
    }
}
