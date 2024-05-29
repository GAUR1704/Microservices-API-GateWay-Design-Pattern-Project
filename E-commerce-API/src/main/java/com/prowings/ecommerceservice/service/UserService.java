package com.prowings.ecommerceservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prowings.ecommerceservice.model.User;

@FeignClient(name = "E-commerce-User-Service")
public interface UserService {
	
    @GetMapping("/user")
    String getUsers();
    
    @PostMapping("/user")
    User createUser(@RequestBody User user);
}