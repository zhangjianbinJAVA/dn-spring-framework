package com.dn.spring.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 自定义命名空间解析类
 * <p>
 * 自定义标签解析
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        /**
         * 自定义标签解析类
         */
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }
}
