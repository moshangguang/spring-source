package org.example.service;

import org.springframework.stereotype.Component;


public class HelloService {
    @Component
    public class FooService {
    }

    @Component
    public static class BarService {
    }

    @Component
    public interface Hello {
        void sayHello();
    }
}
