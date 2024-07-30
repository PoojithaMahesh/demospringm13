package com.jsp.demospringm13.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping("/abc")
	public String firstApi() {
	return "yes i have reeceived my response back in postman";	
	}
}
