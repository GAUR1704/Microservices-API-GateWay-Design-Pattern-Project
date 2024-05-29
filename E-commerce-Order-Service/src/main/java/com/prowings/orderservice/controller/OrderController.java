package com.prowings.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.orderservice.model.Order;
import com.prowings.orderservice.service.OrderService;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }
    
    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}
