package org.ecom.ama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmaServcieRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmaServcieRegistryApplication.class, args);
	}
}
