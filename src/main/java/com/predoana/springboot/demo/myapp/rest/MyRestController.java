package com.predoana.springboot.demo.myapp.rest;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	
	// "/" return my message
	@GetMapping
	public String sayHello() {
		return "Hi! Welcome to my first project! " + LocalDateTime.now();
	}

}
