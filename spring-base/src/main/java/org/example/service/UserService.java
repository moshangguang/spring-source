package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private OrderService orderService;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
