package com.shopwave.shopwave_starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// ID : ATE/6972/14

@SpringBootApplication
@ComponentScan(basePackages = "com.shopwave")
@EnableJpaRepositories(basePackages = "com.shopwave.repository")
@EntityScan(basePackages = "com.shopwave.model")
public class ShopwaveStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopwaveStarterApplication.class, args);
	}
}