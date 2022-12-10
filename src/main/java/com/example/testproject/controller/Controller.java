package com.example.testproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	
	@GetMapping(value = "/test")
	public String test() {
		return "Test";
	}

}
