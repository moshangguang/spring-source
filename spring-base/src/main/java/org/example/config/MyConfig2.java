package org.example.config;

import org.example.beans.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.service")
public class MyConfig2 {
    @Bean(initMethod = "ccc", destroyMethod = "ddd")
    public A getA() {
        return new A();
    }
}
