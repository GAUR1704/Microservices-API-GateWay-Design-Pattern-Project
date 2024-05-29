package com.prowings.orderservice.service;

import org.springframework.stereotype.Service;

import com.prowings.orderservice.model.Order;
import com.prowings.orderservice.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
    
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}