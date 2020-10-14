package com.sbit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class WelcomeController {

	@GetMapping(value = {"/welcome"})
	public String welcome() {
	
		String welcomeMsg = "Welcome to SBIT...";
		return welcomeMsg;
	}
}




