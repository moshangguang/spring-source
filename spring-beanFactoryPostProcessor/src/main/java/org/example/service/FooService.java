package org.example.service;

import org.example.registrar.TestRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(TestRegistrar.class)
public class FooService {
}
