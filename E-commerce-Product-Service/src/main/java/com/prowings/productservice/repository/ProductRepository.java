package com.prowings.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prowings.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}