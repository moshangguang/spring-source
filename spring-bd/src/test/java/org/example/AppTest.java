package org.example;

import static org.junit.Assert.assertTrue;

import org.example.config.MyConfig;
import org.example.service.TestAService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
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
