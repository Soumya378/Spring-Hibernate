package com.luv2code.sprinboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on Server is --"+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String workout() {
		return "Run a hard 5K";
	}
	
	@GetMapping("/fortune")
	public String fortune() {
		return "Today is your lucky day";
	}

}
