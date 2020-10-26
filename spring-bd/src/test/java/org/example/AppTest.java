package org.example;

import org.example.beans.Person;
import org.example.config.MyConfig;
import org.example.config.MyConfig2;
import org.example.service.TestAService;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test08() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        BeanDefinition myConfigBd = ac.getBeanFactory().getBeanDefinition("myConfig");
        System.out.println("myConfigBd source:" + myConfigBd.getSource());
        BeanDefinition a1ServiceBd = ac.getBeanFactory().getBeanDefinition("a1Service");
        System.out.println("a1Service source:" + a1ServiceBd.getSource());
        System.out.println("________________");
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring.xml");
        BeanDefinition amyBd = cc.getBeanFactory().getBeanDefinition("amy");
        System.out.println("amy source:" + amyBd.getSource());
    }

    @Test
    public void test07() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class, MyConfig2.class);
        System.out.println("___myConfigBd___");
        BeanDefinition myConfigBd = ac.getBeanFactory().getBeanDefinition("myConfig");
        System.out.println("myConfigBd class:" + myConfigBd.getClass());
        for (String attributeName : myConfigBd.attributeNames()) {
            System.out.println(attributeName + ":" + myConfigBd.getAttribute(attributeName));
        }
        System.out.println("___myConfig2___");
        BeanDefinition myConfig2Bd = ac.getBeanFactory().getBeanDefinition("myConfig2");
        System.out.println("myConfig2Bd class:" + myConfig2Bd.getClass());
        for (String attributeName : myConfig2Bd.attributeNames()) {
            System.out.println(attributeName + ":" + myConfig2Bd.getAttribute(attributeName));
        }
        System.out.println("___a1ServiceBd___");
        BeanDefinition a1ServiceBd = ac.getBeanFactory().getBeanDefinition("a1Service");
        System.out.println("a1ServiceBd class:" + a1ServiceBd.getClass());
        for (String attributeName : a1ServiceBd.attributeNames()) {
            System.out.println(attributeName + ":" + myConfigBd.getAttribute(attributeName));
        }
    }

    @Test
    public void test06() {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring.xml");
        BeanDefinition beanDefinition = cc.getBeanFactory().getBeanDefinition("a");
        System.out.println("a initMethodName:" + beanDefinition.getInitMethodName());
        System.out.println("a destroyMethodName:" + beanDefinition.getDestroyMethodName());
        cc.close();
    }

    @Test
    public void test05() {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("spring.xml");
        BeanDefinition xiaomi = cc.getBeanFactory().getBeanDefinition("xiaomi");
        System.out.println("xiaomi beanClassName:" + xiaomi.getBeanClassName());
        System.out.println("xiaomi factoryBeanName:" + xiaomi.getFactoryBeanName());
        System.out.println("xiaomi factoryMethodName:" + xiaomi.getFactoryMethodName());
        System.out.println("__________________");
        BeanDefinition tcl = cc.getBeanFactory().getBeanDefinition("tcl");
        System.out.println("tcl beanClassName:" + tcl.getBeanClassName());
        System.out.println("tcl factoryMethodName:" + tcl.getFactoryMethodName());
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
