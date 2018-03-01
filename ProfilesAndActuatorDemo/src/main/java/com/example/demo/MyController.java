package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Value("${employee.name}")
	// @ConfigurationProperties(value="employee")
	private String userName;
	
	@RequestMapping(value="/invite",method=RequestMethod.GET)
	public String getInvitation()
	{
		return "Hi "+userName+" Welcome";
	}
}
