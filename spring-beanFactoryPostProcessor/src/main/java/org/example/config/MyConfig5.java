package org.example.config;

import org.example.pojo.A;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.service")
public class MyConfig5 {
    @Bean
    public A getA() {
        return new A();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig5.class);
        BeanDefinition myConfig5 = ac.getBeanDefinition("myConfig5");
        BeanDefinition getA = ac.getBeanDefinition("getA");
        System.out.println("myConfig5 className:" + myConfig5.getBeanClassName());
        System.out.println("getA className:" + getA.getBeanClassName());
        System.out.println("getA factoryMethodName:" + getA.getFactoryMethodName());
    }
}
