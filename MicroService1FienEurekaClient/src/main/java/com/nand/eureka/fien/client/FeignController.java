/**
 * 
 */
package com.nand.eureka.fien.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 611443876
 *
 */
@RestController
public class FeignController {

	@Autowired
	GreetingClient greetingClient;
	
	@RequestMapping("/get-greeting")
	public String greeting() {
		return "greeting from Fein micro service calling another service :: " +  greetingClient.greeting();        
    }
}
