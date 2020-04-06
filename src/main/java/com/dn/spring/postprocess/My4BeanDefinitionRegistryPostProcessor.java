package com.dn.spring.postprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class My4BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor,
        PriorityOrdered {

    private Logger logger = LoggerFactory.getLogger(My4BeanDefinitionRegistryPostProcessor.class);


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        logger.info("BeanDefinitionRegistryPostProcessor postProcessBeanFactory PriorityOrdered My4BeanDefinitionRegistryPostProcessor");

    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry arg0)
            throws BeansException {
        logger.info("BeanDefinitionRegistryPostProcessor PriorityOrdered postProcessBeanDefinitionRegistry My4BeanDefinitionRegistryPostProcessor");
    }

}
