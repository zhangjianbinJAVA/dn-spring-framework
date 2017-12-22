package com.dn.spring.service;

public class MyServiceImpl implements MyService {

    @Override
    public void execute() {
        System.out.println("execute执行");
        //        throw new RuntimeException();
    }
}
