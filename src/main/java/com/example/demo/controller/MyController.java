package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/testdocker")
	public String getData() {
		return "Hi, docker app";
		
	}

	@GetMapping("/user")
	public String getUser() {
		return "Hi, user";

	}

}
