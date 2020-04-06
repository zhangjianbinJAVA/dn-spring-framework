### spring 源码分析

### 重点类
AbstractApplicationContext.refresh() -> invokeBeanFactoryPostProcessors(beanFactory);
#### BeanDefinitionRegistryPostProcessor 和 BeanFactoryPostProcessor 接口对 beanDifinition 的扩展
> 1. BeanFactoryPostProcessor 实现 postProcessBeanFactory 方法
> 2. BeanDefinitionRegistryPostProcessor 实现 postProcessBeanDefinitionRegistry 方法

BeanFactoryPostProcessor 优先级问题:  
spring 内部先处理 PriorityOrdered 实现类 再处理 Ordered 实现类

> 见 com.dn.spring.postprocess 包

#### MergedBeanDefinitionPostProcessor 和 BeanPostProcessor 接口
> 1. MergedBeanDefinitionPostProcessor 
> 2. BeanPostProcessor

> 见 com.dn.spring.postprocess 包

#### spring 监听器
> 见 com.dn.spring.listener

> com.dn.spring.SpringTest.test5

#### Bean 实例化、IOC依赖注入
> xml 属性注入 ，    
> 见 com.dongnao.jack.testbean.Student 包的bean配置  

> ioc 注入    
> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#doCreateBean

#### spring mvc
1. spring mvc 的初始化工作
    > org.springframework.web.servlet.DispatcherServlet.initStrategies

#### spring aop jdk动态代理
> org.springframework.aop.framework.JdkDynamicAopProxy.invoke
#### spring aop cglib动代理
> org.springframework.aop.framework.CglibAopProxy#getProxy(java.lang.ClassLoader)

#### spring aop 注解切面解析
