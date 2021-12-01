package com.neosoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ConactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConactServiceApplication.class, args);
	}

}
