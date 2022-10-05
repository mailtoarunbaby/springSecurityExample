package com.arun.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@GetMapping("/home")
	public String home() {
		return "landing home!";
	}
	
	@GetMapping("/test")
	public String testPage() {
		return "secure test page";
	}

}
