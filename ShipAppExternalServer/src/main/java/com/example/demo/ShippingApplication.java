package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ShippingApplication extends SpringBootServletInitializer {
	//-----------------------Used for WAR----------------------
	//replacer for main method - configure this app in servlet initializer mechanism
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	// TODO Auto-generated method stub
	return builder.sources(ShippingApplication.class);
}
//------------------Used for JAR-------------------------
/*	public static void main(String[] args) {
		SpringApplication.run(ShippingApplication.class, args);
	}*/
}
