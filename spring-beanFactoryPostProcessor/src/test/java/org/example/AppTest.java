package org.example;

import static org.junit.Assert.assertTrue;

import org.example.beanFactoryPostProcessor.Test2BeanFactoryPostProcessor;
import org.example.beanFactoryPostProcessor.Test3BeanDefinitionRegistryPostProcessor;
import org.example.config.MyConfig;
import org.example.config.MyConfig2;
import org.example.service.HelloService;
import org.example.service.OrderService;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Unit test for simple App.
 */


public class AppTest {
    @Test
    public void test05() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.addBeanFactoryPostProcessor(new Test2BeanFactoryPostProcessor());
        ac.addBeanFactoryPostProcessor(new Test3BeanDefinitionRegistryPostProcessor());
        ac.refresh();
    }

    @Test
    public void test04() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.scan("org.example.service");
        ac.refresh();
        System.out.println(ac.getBean("orderService"));
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(OrderService.class);
        ac.registerBeanDefinition("orderSvc", rootBeanDefinition);
        System.out.println(ac.getBean("orderSvc").getClass());
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
    }

    @Test
    public void test01() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("userService class:" + ac.getBean("userService").getClass());
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
