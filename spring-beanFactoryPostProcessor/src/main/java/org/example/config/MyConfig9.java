package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("org.example.service")
@Import(MyConfig10.class)
public class MyConfig9 {
}
