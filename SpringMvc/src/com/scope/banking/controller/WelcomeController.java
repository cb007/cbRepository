package com.scope.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcomeMessage(ModelMap model){
		System.out.println("/welcome");
		model.addAttribute("message", "Welcome to Retail Workbench");
		return "index";
		
	}
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public String happyMessage(ModelMap model){
		System.out.println("/product");
		model.addAttribute("message", "Thanks for applying products");
		return "product";
		
	}
	
	@RequestMapping(value="/registration.htm", method=RequestMethod.GET)
	public String registration(ModelMap model){
		System.out.println("/registration");
		model.addAttribute("form", "Loading Form");
		return "registration";
		
	}
}
