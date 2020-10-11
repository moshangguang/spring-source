package org.example;

import static org.junit.Assert.assertTrue;

import org.example.beans.ThingOne;
import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public void test06() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService.getOrderService());
    }

    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        ThingOne thingOne = ac.getBean(ThingOne.class);
        System.out.println(thingOne);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
