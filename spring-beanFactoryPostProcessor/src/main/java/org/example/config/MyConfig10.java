package org.example.config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example.dao")
public class MyConfig10 {
    public MyConfig10() {
        System.out.println("构造MyConfig10...");
    }
}
