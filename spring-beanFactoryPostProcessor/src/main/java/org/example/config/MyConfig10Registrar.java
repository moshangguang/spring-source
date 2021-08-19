package org.example.config;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyConfig10Registrar implements ImportBeanDefinitionRegistrar {
    public MyConfig10Registrar() {
        System.out.println("构造MyConfig10Registrar...");
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        AnnotatedGenericBeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(MyConfig10.class);
        registry.registerBeanDefinition("myConfig10", beanDefinition);
    }
}
