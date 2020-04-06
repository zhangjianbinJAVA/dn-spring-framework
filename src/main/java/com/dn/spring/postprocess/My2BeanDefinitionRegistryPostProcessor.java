package com.dn.spring.postprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor 实现该接口可以完成对beanDifinition的修改
 * <p>
 * 启动过程中修改bean的属性值
 */
@Component
public class My2BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    private Logger logger = LoggerFactory.getLogger(My2BeanDefinitionRegistryPostProcessor.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        logger.info("BeanDefinitionRegistryPostProcessor postProcessBeanFactory My2BeanDefinitionRegistryPostProcessor");

    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry arg0)
            throws BeansException {
        logger.info("BeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry My2BeanDefinitionRegistryPostProcessor");

        BeanDefinition bd = arg0.getBeanDefinition("jackstudent");
        MutablePropertyValues mpv = bd.getPropertyValues();
        // 修改 bean 属性值
        mpv.addPropertyValue("username", "jack-vip");
    }

}
