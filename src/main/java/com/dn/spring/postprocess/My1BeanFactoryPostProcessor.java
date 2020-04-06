package com.dn.spring.postprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor 实现该接口可以完成对 beanDifinition 的修改
 */
@Component
public class My1BeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    private Logger logger = LoggerFactory.getLogger(My1BeanFactoryPostProcessor.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        logger.info("BeanFactoryPostProcessor postProcessBeanFactory My1BeanFactoryPostProcessor");

        // 根据bean id 获取 bean 的 BeanDefinition
        BeanDefinition bd = arg0.getBeanDefinition("jackstudent");
        // 获取bean 对象中的所有属性
        MutablePropertyValues mpv = bd.getPropertyValues();
        // 修改 bean 属性值
        mpv.addPropertyValue("password", "fhdksafhldsafjl-vip");
    }

}
