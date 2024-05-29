package com.prowings.ecommerceservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prowings.ecommerceservice.model.Product;

@FeignClient(name = "E-commerce-Product-Service")
public interface ProductService {
	
    @GetMapping("/product")
    String getProducts();
    
    @PostMapping("/product")
    Product createProduct(@RequestBody Product product);
}