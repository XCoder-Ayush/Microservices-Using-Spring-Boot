package com.microservice.esd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EsdApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsdApplication.class, args);
	}

}
