package org.example.service;


public class UserService {
    private OrderService orderService;
    private OrderService OrderSvc;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderService getOrderSvc() {
        return OrderSvc;
    }

    public void setOrderSvc(OrderService orderSvc) {
        OrderSvc = orderSvc;
    }
}
