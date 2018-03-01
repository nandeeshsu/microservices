package com.nand.eureka.fien.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MicroService1FienEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroService1FienEurekaClientApplication.class, args);
	}
}
