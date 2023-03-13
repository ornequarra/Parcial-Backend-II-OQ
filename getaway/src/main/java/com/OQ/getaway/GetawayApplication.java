package com.OQ.getaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class GetawayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetawayApplication.class, args);
	}

}
