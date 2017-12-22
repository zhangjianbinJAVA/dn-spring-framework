package com.dn.spring.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Ordered 实现该接口可以控制类的执行顺序
 * <p>
 * 启动过程中添加bean的属性值-添加
 */

public class My5BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, Ordered {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        // TODO Auto-generated method stub

    }

    @Override
    public int getOrder() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry arg0)
            throws BeansException {
        System.out.println("BeanDefinitionRegistryPostProcessor Ordered My5BeanDefinitionRegistryPostProcessor");


        BeanDefinition bd = arg0.getBeanDefinition("jackstudent");
        MutablePropertyValues mpv = bd.getPropertyValues();

        // 添加字段 schoole 属性值
        mpv.addPropertyValue("school", "dongnao");

    }

}
