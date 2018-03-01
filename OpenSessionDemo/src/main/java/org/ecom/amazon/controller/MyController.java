package org.ecom.amazon.controller;

import org.ecom.amazon.bean.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value="/customer",method=RequestMethod.GET)
	public Customer paymentProcessing()
	{
		//some logic
		return new Customer(121,"Shweta");
	}
	
	//http://localhost:8085/amazon/customer/path-variable/shweta
	@GetMapping(path="/customer/path-variable/{name}")
	public Customer pathVariable(@PathVariable String name)
	{
		return new Customer(151,name);
	}
}
