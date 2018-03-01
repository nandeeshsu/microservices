package org.ecom.ama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient 
//Use below annotation only in case of feign client. Enable feign dependency
//@EnableFeignClients
public class AmaPurchaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmaPurchaseApplication.class, args);
	}
	
	//method to return the RestTemplate as a response;
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
