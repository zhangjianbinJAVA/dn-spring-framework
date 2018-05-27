package com.zhang.spring.springextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * user: zhangjianbin <br/>
 * date: 2018/5/27 16:46
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("会在Bean初始化(即调用setter)之前");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("会在Bean初始化(即调用setter)之后");
        return null;
    }
}
