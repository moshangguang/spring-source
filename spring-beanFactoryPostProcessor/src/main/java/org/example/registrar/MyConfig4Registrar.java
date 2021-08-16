package org.example.registrar;

import org.example.config.MyConfig4;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyConfig4Registrar implements ImportBeanDefinitionRegistrar {
    public MyConfig4Registrar() {
        System.out.println("666");
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        AnnotatedGenericBeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(MyConfig4.class);
        registry.registerBeanDefinition("myConfig4", beanDefinition);
    }
}
