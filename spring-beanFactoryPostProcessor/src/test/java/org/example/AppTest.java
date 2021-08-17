package org.example;

import static org.junit.Assert.assertTrue;

import org.example.beanFactoryPostProcessor.Test2BeanFactoryPostProcessor;
import org.example.beanFactoryPostProcessor.Test3BeanDefinitionRegistryPostProcessor;
import org.example.config.MyConfig;
import org.example.config.MyConfig2;
import org.example.config.MyConfig3;
import org.example.config.MyConfig6;
import org.example.dao.UserDao;
import org.example.mapper.UserMapper;
import org.example.service.HelloService;
import org.example.service.OrderService;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */


public class AppTest {
    @Test
    public void test11() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig6.class);
        BeanDefinition myConfig5 = ac.getBeanDefinition("myConfig6");
        BeanDefinition getA = ac.getBeanDefinition("aBean");
        System.out.println("myConfig6 class:" + myConfig5.getBeanClassName());
        System.out.println("aBean class:" + getA.getBeanClassName());
        System.out.println("aBean factoryMethodName:" + getA.getFactoryMethodName());
    }

    @Test
    public void test10() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
    }

    @Test
    public void test09() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
                MyConfig.class,
                MyConfig3.class);
        UserDao userDao = ac.getBean(UserDao.class);
        System.out.println(userDao);
    }

    @Test
    public void test08() {
        class A {
        }
        A a = new A();
        System.out.println("a hashCode:" + a.hashCode());
        System.out.println("a identityHashCode:" + System.identityHashCode(a));
        class B {
            @Override
            public int hashCode() {
                return 0;
            }
        }
        B b1 = new B();
        System.out.println("b1 hashCode:" + b1.hashCode());
        System.out.println("b1 identityHashCode:" + System.identityHashCode(b1));
        B b2 = new B();
        System.out.println("b2 hashCode:" + b2.hashCode());
        System.out.println("b2 identityHashCode:" + System.identityHashCode(b2));
    }

    @Test
    public void test07() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
                MyConfig.class,
                MyConfig3.class);
        MyConfig myConfig = ac.getBean(MyConfig.class);
        MyConfig3 myConfig3 = ac.getBean(MyConfig3.class);
        System.out.println(myConfig.getClass());
        System.out.println(myConfig3.getClass());
    }

    @Test
    public void test06() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig2.class);
        UserMapper userMapper = ac.getBean(UserMapper.class);
        System.out.println(userMapper.getClass());
        //  System.out.println(userMapper.getUser(1));
    }

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
