package com.coursecube.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {

	@GetMapping("/show")
	public String showMasg() {
		return "Show wish message";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Show welcome message";
	}
}
