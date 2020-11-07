package org.example;

import static org.junit.Assert.assertTrue;

import org.example.config.MyConfig;
import org.example.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
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
