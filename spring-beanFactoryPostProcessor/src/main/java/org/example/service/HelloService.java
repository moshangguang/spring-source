package org.example.service;

import org.springframework.stereotype.Component;

/**
 * 如果程序员有提供BeanFactoryPostProcessor对象，会遍历这些对象判断能否
 * 转型成BeanDefinitionRegistryPostProcessor，如果可以则执行
 * 对象的postProcessBeanDefinitionRegistry(...)方法，并将对象
 * 存放到registryProcessors列表中，如果不能转型则将对象存放到
 * regularPostProcessors列表，
 */
public class HelloService {
    @Component
    public class FooService {
    }

    @Component
    public static class BarService {
    }

    @Component
    public interface Hello {
        void sayHello();
    }
}
