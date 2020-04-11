package com.portal.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@RequestMapping(value = "/customer/getcustomer", method = { RequestMethod.GET, RequestMethod.POST })
	public String getcustomer() {
	
		LOGGER.info("Inside Customer service");
		return "customer service";
		
	}
	
	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String home() {
		LOGGER.info("Inside Customer service home V1");
		return "home V1";
		
	}
	
	@RequestMapping(value = "/customer/getprac", method = { RequestMethod.GET, RequestMethod.POST })
	public String getprac() {
		LOGGER.info("Get practice Service V1");
		
		final String uri = "http://practice:8000/prac/practice/getprac";
		
		RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
		return result;
		
	}
}
