package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Ship;

@Controller
public class ShipStatusController {
	@RequestMapping(value="/details",method=RequestMethod.GET)
public ModelAndView getShipDetails()
{
	ModelAndView mv=new ModelAndView();
	mv.setViewName("shipping");
	Ship ship=new Ship(101,344.4f,"Parcel");
	mv.addObject("status", ship);
	System.out.println("---------------------Data added -------------------");
	return mv;
}
}
