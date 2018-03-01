package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PropertyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyServerApplication.class, args);
	}
}
