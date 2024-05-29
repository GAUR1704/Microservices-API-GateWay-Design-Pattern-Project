package com.prowings.ecommerceservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prowings.ecommerceservice.model.Order;

@FeignClient(name = "E-commerce-Order-Service")
public interface OrderService {
	
    @GetMapping("/order")
    String getOrders();
    
    @PostMapping("/order")
    Order createOrder(@RequestBody Order order);
}
