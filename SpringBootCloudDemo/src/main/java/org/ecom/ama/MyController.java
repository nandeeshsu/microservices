package org.ecom.ama;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/hello")
	public String myMethod()
	{
		return "Hello World";
	}
}
