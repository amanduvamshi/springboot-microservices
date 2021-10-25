package com.krishna.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.krishna" })
@EntityScan("com.krishna")
@EnableJpaRepositories("com.krishna.dao")
public class CartServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
		
	}

}
