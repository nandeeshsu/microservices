/**
 * 
 */
package com.nand.eureka.fien.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 611443876
 *
 */
@FeignClient("MicroService1EurekaClient")
public interface GreetingClient {
	@RequestMapping("/greeting")
	String greeting();
}
