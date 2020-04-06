package com.dn.spring.cglib.simple;

/**
 * 1
 * 使用 cglib 动态代理时，代理类（在内存中）就是目标类的子类
 */
public class TargetClass {
    
    public void add() {
        System.out.println("add");
    }
    
    public void del() {
        System.out.println("del");
    }
    
    public void update() {
        System.out.println("update");
    }
}
