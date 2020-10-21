package org.example;

import static org.junit.Assert.assertTrue;

import org.example.beans.Person;
import org.example.config.MyConfig;
import org.example.service.TestAService;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test05() {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring.xml");
        BeanDefinition xiaomi = cc.getBeanFactory().getBeanDefinition("xiaomi");
        System.out.println(xiaomi.getBeanClassName());
        BeanDefinition tcl = cc.getBeanFactory().getBeanDefinition("tcl");
        System.out.println(tcl.getBeanClassName());
    }

    @Test
    public void test04() {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring.xml");
        BeanDefinition amyBd = cc.getBeanFactory().getBeanDefinition("amy");
        for (ConstructorArgumentValues.ValueHolder holder : amyBd.getConstructorArgumentValues().getGenericArgumentValues()) {
            System.out.println(holder.getName() + ":" + holder.getValue());
        }
        BeanDefinition johnBd = cc.getBeanFactory().getBeanDefinition("john");
        for (Map.Entry<Integer, ConstructorArgumentValues.ValueHolder> entry : johnBd.getConstructorArgumentValues().getIndexedArgumentValues().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().getValue());
        }
    }

    @Test
    public void test03() {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring.xml");
        BeanDefinition samBd = cc.getBeanFactory().getBeanDefinition("sam");
        BeanDefinition parentBd = cc.getBeanFactory().getBeanDefinition(samBd.getParentName());
        System.out.println("samBd parentName:" + samBd.getParentName());
        System.out.println("samBd class:" + samBd.getClass());
        System.out.println("parentBd class:" + parentBd.getClass());
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
