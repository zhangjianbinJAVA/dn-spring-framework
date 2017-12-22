package com.dn.spring.aop;

/**
 * 接口的方法通过aop动态注入其它bean中 实现
 */
public class IntroductionClass implements IntroductionIntf {

    @Override
    public void extend() {
        System.out.println("我是切面Introduction引入的方法");
    }
}
