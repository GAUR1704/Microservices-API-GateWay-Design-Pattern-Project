package com.prowings.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ECommerceOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceOrderServiceApplication.class, args);
	}

}
