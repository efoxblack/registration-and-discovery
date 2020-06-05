package com.example.springregistrationanddiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringRegistrationAndDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRegistrationAndDiscoveryServiceApplication.class, args);
	}

}
