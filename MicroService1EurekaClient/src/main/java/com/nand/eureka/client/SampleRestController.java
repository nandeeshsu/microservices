/**
 * 
 */
package com.nand.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 611443876
 *
 */
@RestController
public class SampleRestController {

	@RequestMapping("/greeting")
	public String greetings() {
		return "hellow from eureka client connecting eurka registry and registering";
	}
}
