package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("org.example.service")
@Import(MyConfig10ImportSelector.class)
public class MyConfig11 {
}
