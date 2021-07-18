package org.example;

import static org.junit.Assert.assertTrue;

import org.example.beans.*;
import org.example.config.*;
import org.example.service.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test16() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        HelloService helloService = ac.getBean(HelloService.class);
        System.out.println(helloService.getWorldService());
        System.out.println(helloService.getFooService());
    }

    @Test
    public void test15() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig5.class);
        FruitPlate fruitPlate = ac.getBean(FruitPlate.class);
        System.out.println(Arrays.toString(fruitPlate.getFruits()));
        System.out.println(fruitPlate.getFruitList());
        System.out.println(fruitPlate.getFruitSet());
        System.out.println(fruitPlate.getFruitMap());
        System.out.println(fruitPlate.getPrimary());
    }

    @Test
    public void test14() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig5.class);
        MovieRecommender recommender = ac.getBean(MovieRecommender.class);
        System.out.println(recommender.getMovieFinder());
        System.out.println(recommender.getMovieCatalog());
        System.out.println(recommender.getCustomerPreferenceDao());
    }

    @Test
    public void test13() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig5.class);
        Object robot = ac.getBean("robotFactoryBean");
        System.out.println(robot);
        System.out.println(robot.getClass());
        Object factoryBean = ac.getBean("&robotFactoryBean");
        System.out.println(factoryBean);
        System.out.println(factoryBean.getClass());
    }

    @Test
    public void test12() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig5.class);
    }

    @Test
    public void test11() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig4.class);
        System.out.println(ac.getBean("d"));
    }

    @Test
    public void test10() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig3.class);
        System.out.println(ac.getBean(D.class));
    }

    @Test
    public void test09() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        ac.stop();
    }

    @Test
    public void test08() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        ac.start();
        ac.stop();
    }

    @Test
    public void test07() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig2.class);
        ac.close();
    }

    @Test
    public void test06() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        CommandManager1 commandManager1 = ac.getBean(CommandManager1.class);
        System.out.println(commandManager1.createCommandService());
        System.out.println(commandManager1.createCommandService());
        CommandManager2 commandManager2 = ac.getBean(CommandManager2.class);
        System.out.println(commandManager2.createCommandService());
        System.out.println(commandManager2.createCommandService());
    }

    @Test
    public void test05() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        CommandManager commandManager = ac.getBean(CommandManager.class);
        //获取@Autowired注入的CommandService
        System.out.println(commandManager.getCommandService());
        System.out.println(commandManager.getCommandService());
        //获取方法注入的CommandService
        System.out.println(commandManager.createCommandService());
        System.out.println(commandManager.createCommandService());
    }

    @Test
    public void test04() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(ac.getBean(CService.class));
    }

    @Test
    public void test03() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService1 = ac.getBean("userService1", UserService.class);
        System.out.println("userService1.orderService:" + userService1.getOrderService());
        System.out.println("userService1.orderSvc:" + userService1.getOrderSvc());
        UserService userService2 = ac.getBean("userService2", UserService.class);
        System.out.println("userService2.orderService:" + userService2.getOrderService());
        System.out.println("userService2.orderSvc:" + userService2.getOrderSvc());
    }

    @Test
    public void test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(ac.getBean("honglou"));
    }

    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        ThingOne thingOne = ac.getBean(ThingOne.class);
        System.out.println(thingOne);
        System.out.println(ac.getBean("tom"));
        System.out.println(ac.getBean("amy"));
        System.out.println(ac.getBean("sam"));
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
