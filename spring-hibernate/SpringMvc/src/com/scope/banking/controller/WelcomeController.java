package com.scope.banking.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.hibernate.Transaction;
import org.hibernate.transaction.TransactionManagerLookup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scope.banking.entities.Customer;
import com.scope.banking.entities.State;
import com.scope.banking.services.CustomerService;

@Controller
public class WelcomeController {

	@Autowired
	@Qualifier("validator")
	private Validator validator;
	
	@Autowired
	private CustomerService customerService;
	
	@InitBinder
	private void dateBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY");
		CustomDateEditor customDateEditor = new CustomDateEditor(
				simpleDateFormat, true);
		webDataBinder.registerCustomEditor(Date.class, customDateEditor);
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomeMessage(ModelMap model) {
		System.out.println("/welcome");
		model.addAttribute("message", "Welcome to Retail Workbench");
		return "index";

	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String happyMessage(ModelMap model) {
		System.out.println("/product");
		model.addAttribute("message", "Thanks for applying products");
		return "product";

	}

	@RequestMapping(value = "/registration.htm", method = RequestMethod.GET)
	public String registration(ModelMap model) {
		System.out.println("/registration");
		model.addAttribute("form", "Loading Form");
		// Whatever command name is given we need to set attribute in model to
		// avoid below error
		// neither-bindingresult-nor-plain-target-object-for-bean-name-available-as-request
		model.addAttribute("customer", new Customer());
		return "registration";

	}

	@RequestMapping(value = "/customerRegistration.htm", method = RequestMethod.POST)
	public ModelAndView customerRegistration(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("customer") @Valid Customer customer,
			BindingResult result) {
		System.out.println("/customerRegistration");
		System.out.println("Customer Name:" + customer.getName());
		validator.validate(customer, result);
		System.out.println("Result:" + result);
		ModelAndView mv = new ModelAndView();
		if (result.hasErrors()) {
			mv.setViewName("registration");
		} else {
			customerService.addCustomer(customer);
			mv.addObject("message", "Successfully registered");
			mv.setViewName("success");
		}
		return mv;

	}
	
	@ModelAttribute("stateList")
	public List<State> getStateList()
	{
		List<State> stateList= new ArrayList<State>();
		State state=new State();
		state.setCode(1);
		state.setName("TamilNadu");
		stateList.add(state);
		state=new State();
		state.setCode(2);
		state.setName("Pondichery");
		stateList.add(state);
		return stateList;
		
	}
}
