package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/testingdocker")
	public String getData() {
		return "Hii, docker app";
		
	}

	@GetMapping("/users")
	public String getUser() {
		return "Hi, user";

	}

	@GetMapping("/newuser")
	public String getNewUser() {
		return "Hi, new user";

	}

}
