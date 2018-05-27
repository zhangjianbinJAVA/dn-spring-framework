package com.zhang.spring.springextend;


import org.springframework.stereotype.Component;

/**
 * user: zhangjianbin <br/>
 * date: 2018/5/27 16:25
 */
@Component
public class MyFactoryBean implements FactoryBean<FactoryBean> {

    /**
     * 获取得是 FactoryBean 对象，而不是 MyFactoryBean 对象
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        return new FactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
