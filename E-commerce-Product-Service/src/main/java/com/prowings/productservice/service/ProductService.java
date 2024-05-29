package com.prowings.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prowings.productservice.model.Product;
import com.prowings.productservice.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}