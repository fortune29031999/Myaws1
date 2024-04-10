package com.myaws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
	@GetMapping("/kissa")
	public String get() {
		return "love.html";
	}
	@GetMapping("/employee") 
	public String geter() {
		return "employee.html";
	}

}
