package com.zhang.spring.springextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * user: zhangjianbin <br/>
 * date: 2018/5/27 16:22
 */
@Component
public class MyBeanFactoryAware implements BeanFactoryAware {
    private BeanFactory beanFactory = null;


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("可以在该Bean被加载的过程中获取加载该Bean的BeanFactory，同时也可以获取这个BeanFactory中加载的其它Bean");
        beanFactory = beanFactory;


    }
}
