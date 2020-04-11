package com.practice.practice.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PracticeController.class);
	
	
	@RequestMapping(value = "/practice/getprac", method = { RequestMethod.GET })
	public String getcustomer() throws Exception {
	
		LOGGER.info("Inside Practice service V4");
		Random random = new Random(); 
		int randomNumber = random.nextInt(10);
		
		LOGGER.info("Inside Practice service V4 :"+randomNumber);
		if(randomNumber < 5) {
			throw new Exception("not able to process");
		} else {
		return "practice service V4";
		}
		
	}
	
	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String home() {
	
		LOGGER.info("Inside Practice service Home V4"); 
		return "practice V4";
		
	}
}
