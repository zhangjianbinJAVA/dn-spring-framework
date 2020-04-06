package com.dn.spring.postprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class My6BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, Ordered {

    private Logger logger = LoggerFactory.getLogger(My6BeanDefinitionRegistryPostProcessor.class);


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        logger.info("BeanDefinitionRegistryPostProcessor Ordered postProcessBeanFactory My6BeanDefinitionRegistryPostProcessor");

    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry arg0)
            throws BeansException {
        logger.info("BeanDefinitionRegistryPostProcessor Ordered postProcessBeanDefinitionRegistry My6BeanDefinitionRegistryPostProcessor");
    }

}
