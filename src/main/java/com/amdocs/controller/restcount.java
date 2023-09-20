package com.amdocs.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcount {
	@GetMapping("/get")
	public String show() {
		return "Welcome to the spring boot and jenkin demo!";
	}
	}


