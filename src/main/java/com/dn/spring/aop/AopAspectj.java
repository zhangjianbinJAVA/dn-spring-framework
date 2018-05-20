package com.dn.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.List;

/**
 * xml 方式 aop   切面 定义
 */
public class AopAspectj {

    public void before(JoinPoint joinPoint) {
        String classname = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("@before Execute! --class name: " + classname + ", method name: " + methodName + " " + args);

        System.out.println("开启事务");
    }

    public void after(JoinPoint point) {
        System.out.println("@After：模拟释放资源...");
        System.out.println("@After：目标方法为：" +
                point.getSignature().getDeclaringTypeName() +
                "." + point.getSignature().getName());
        System.out.println("@After：参数为：" + Arrays.toString(point.getArgs()));
        System.out.println("@After：被织入的目标对象为：" + point.getTarget());

        System.out.println("关闭事务");
    }

    public void afterReturning(JoinPoint point) {
        System.out.println("@AfterReturning：模拟日志记录功能...");
        System.out.println("@AfterReturning：目标方法为：" +
                point.getSignature().getDeclaringTypeName() +
                "." + point.getSignature().getName());
        System.out.println("@AfterReturning：参数为：" +
                Arrays.toString(point.getArgs()));
        System.out.println("@AfterReturning：返回值为：");
        System.out.println("@AfterReturning：被织入的目标对象为：" + point.getTarget());

        System.out.println("返回后通知");
    }

    public void afterthrowing() {
        System.out.println("异常通知....");
    }

    public Object around(ProceedingJoinPoint point) throws Throwable {
//        System.out.println("前置环绕通知");
//        try {
//            point.proceed();
//        } catch (Throwable e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        System.out.println("后置环绕通知");


        System.out.println("@Around：执行目标方法之前...");
        Object obj = point.proceed();
        System.out.println("@Around：执行目标方法之后...");
        System.out.println("@Around：被织入的目标对象为：" + point.getTarget());
        System.out.println("@Around：原返回值：" + obj + "，这是返回结果的后缀");
        return obj;
    }
}
