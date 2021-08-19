package org.example.service2;

import org.example.registrar.MyConfig11Registrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(MyConfig11Registrar.class)
public class Test2Service {
}
