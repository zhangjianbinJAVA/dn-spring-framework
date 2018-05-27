package com.zhang.spring.springextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * user: zhangjianbin <br/>
 * date: 2018/5/27 16:50
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("在Bean被创建之前，获取容器中Bean的定义信息，并且可以进行修改。");
    }
}
