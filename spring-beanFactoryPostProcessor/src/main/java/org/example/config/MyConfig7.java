package org.example.config;

import org.example.pojo.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig7 {
    @Bean
    public A getA() {
        return new A();
    }
}
