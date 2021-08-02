package org.example.service;


public class UserService {
    private OrderService orderService;
    private OrderService orderSvc;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderService getOrderSvc() {
        return orderSvc;
    }

    public void setOrderSvc(OrderService orderSvc) {
        this.orderSvc = orderSvc;
    }
}
