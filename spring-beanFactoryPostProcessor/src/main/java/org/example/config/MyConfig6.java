package org.example.config;

import org.example.pojo.A;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example.service")
@ImportResource("spring.xml")
public class MyConfig6 {
    public static A getA() {
        return new A();
    }
}
