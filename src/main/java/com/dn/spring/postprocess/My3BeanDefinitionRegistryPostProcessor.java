package com.dn.spring.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * PriorityOrdered  实现该接口可以控制类的执行顺序
 */

public class My3BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("postProcessBeanFactory");

    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry arg0)
            throws BeansException {
        System.out.println("BeanDefinitionRegistryPostProcessor PriorityOrdered My3BeanDefinitionRegistryPostProcessor");

    }

    @Override
    public int getOrder() {
        // TODO Auto-generated method stub
        return 0;
    }

}
