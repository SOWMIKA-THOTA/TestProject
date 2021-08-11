package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.MainController;

@RestController

public class MainController {
	
	Logger logger = LoggerFactory.getLogger(MainController.class);
	@GetMapping("/hello")
	public String hello()
	{
		logger.trace("FATAL ERROR");
		return "Hello Daily Code Buffer";
	}
	

}
