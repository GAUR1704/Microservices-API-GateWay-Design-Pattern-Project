package com.prowings.ecommerceservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.ecommerceservice.model.Order;
import com.prowings.ecommerceservice.model.Product;
import com.prowings.ecommerceservice.model.User;
import com.prowings.ecommerceservice.service.OrderService;
import com.prowings.ecommerceservice.service.ProductService;
import com.prowings.ecommerceservice.service.UserService;

@RestController
public class EcommerceController {

    private final OrderService orderService;
    private final ProductService productService;
    private final UserService userService;

    public EcommerceController(OrderService orderService, ProductService productService, UserService userService) {
        this.orderService = orderService;
        this.productService = productService;
        this.userService = userService;
    }

    @GetMapping("/ecommerce/orders")
    public String getOrders() {
        return orderService.getOrders();
    }
    
    @PostMapping("/ecommerce/orders")
    public Order createOrder(@RequestBody Order order) {
    	
    	System.out.println(order);
        return orderService.createOrder(order);
    }

    @GetMapping("/ecommerce/products")
    public String getProducts() {
        return productService.getProducts();
    }
    
    @PostMapping("/ecommerce/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/ecommerce/users")
    public String getUsers() {
        return userService.getUsers();
    }
    
    @PostMapping("/ecommerce/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}