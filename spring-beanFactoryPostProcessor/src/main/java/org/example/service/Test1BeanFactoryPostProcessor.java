package org.example.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class Test1BeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        ScannedGenericBeanDefinition beanDefinition = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("userService");
        System.out.println("UserService beanDefinition class:" + beanDefinition.getBeanClass());
        beanDefinition.setBeanClass(OrderService.class);
    }
}
