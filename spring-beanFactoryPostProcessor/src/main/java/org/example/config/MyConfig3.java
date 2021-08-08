package org.example.config;

import org.example.pojo.A;
import org.example.pojo.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig3 {
    @Bean
    protected A getA() {
        return new A();
    }

    @Bean
    public B getB() {
        return new B();
    }
}

