package com.dn.spring.schema;

/**
 * Spring提供了可扩展Schema的支持
 * <p>
 * 完成一个自定义配置一般需要以下步骤:
 * 设计配置属性
 * 编写XSD文件
 * 编写NamespaceHandler和BeanDefinitionParser完成解析工作
 * 编写spring.handlers和spring.schemas串联起所有部件
 * 在Bean文件中应用
 */
public class People {
    private String id;
    private String name;
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
