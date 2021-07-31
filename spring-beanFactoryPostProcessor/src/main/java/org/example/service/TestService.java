package org.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    public TestService(UserService userService) {

    }

//    public TestService(OrderService orderService) {
//
//    }
}
