package com.prowings.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ECommerceUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceUserServiceApplication.class, args);
	}

}
