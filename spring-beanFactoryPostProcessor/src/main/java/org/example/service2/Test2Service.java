package org.example.service2;

import org.example.config.MyConfig10Registrar;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(MyConfig10Registrar.class)
public class Test2Service {
}
