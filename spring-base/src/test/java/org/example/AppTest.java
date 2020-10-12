package org.example;

import static org.junit.Assert.assertTrue;

import org.example.beans.ThingOne;
import org.example.config.MyConfig;
import org.example.service.CService;
import org.example.service.CommandManager;
import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
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
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService.getOrderService());
        System.out.println(userService.getOrderSvc());
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
