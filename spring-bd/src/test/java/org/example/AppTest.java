package org.example;

import static org.junit.Assert.assertTrue;

import org.example.beans.Person;
import org.example.config.MyConfig;
import org.example.service.TestAService;
import org.junit.Test;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void test03() {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring.xml");
        BeanDefinition samBd = cc.getBeanFactory().getBeanDefinition("sam");
        BeanDefinition parentBd = cc.getBeanFactory().getBeanDefinition(samBd.getParentName());
    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring.xml");
        Person sam = cc.getBean("sam", Person.class);
        System.out.println(sam);
        System.out.println(sam.getName());
        System.out.println(sam.getAge());
        System.out.println("_____________");
        sam = cc.getBean("sam", Person.class);
        System.out.println(sam);
        System.out.println(sam.getName());
        System.out.println(sam.getAge());
    }

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        TestAService test1Service = ac.getBean(TestAService.class);
        System.out.println(test1Service.getService().getClass());
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
