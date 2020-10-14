package com.SmartManager.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SmartController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	
}
