package org.example;

import static org.junit.Assert.assertTrue;

import org.example.config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test02() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
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
