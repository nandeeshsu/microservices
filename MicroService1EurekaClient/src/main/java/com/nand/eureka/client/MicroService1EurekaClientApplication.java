package com.nand.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

//This is generic discovery client used for any service registry other than eureka
@EnableDiscoveryClient

//this is particularly used for the eureka. This will be tight coupling as if the service
//registry is changed to someone else from eureka. then this will also would need to change
//@EnableEurekaClient

public class MicroService1EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroService1EurekaClientApplication.class, args);
	}
}
