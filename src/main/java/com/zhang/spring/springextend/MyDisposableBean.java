package com.zhang.spring.springextend;

import org.springframework.beans.factory.DisposableBean;

/**
 * user: zhangjianbin <br/>
 * date: 2018/5/27 16:21
 */
public class MyDisposableBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("MyDisposableBean 该方法会在Bean被销毁、生命周期结束之前被调用");
    }
}
