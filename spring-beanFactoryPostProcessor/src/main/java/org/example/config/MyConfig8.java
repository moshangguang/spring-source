package org.example.config;

import org.example.pojo.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MyConfig8 {
    @Bean
    public B getB() {
        return new B();
    }
}
