package com.ramit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String defafultPage(){
		System.out.println("Home controller...");
		return "forward:/index.html";
	}
}
