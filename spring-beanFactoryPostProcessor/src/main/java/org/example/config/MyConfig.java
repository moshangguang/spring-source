package org.example.config;

import org.example.pojo.C;
import org.example.registrar.MyConfig4Registrar;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example.service")
@Import(MyConfig4Registrar.class)
public class MyConfig {

    @Bean
    public C c() {
        return new C();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
    }
}
