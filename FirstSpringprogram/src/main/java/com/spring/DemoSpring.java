package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class DemoSpring {
	
	@GetMapping("/welcome")
	public String Welcome() {
		return "First Program";
	}

}
