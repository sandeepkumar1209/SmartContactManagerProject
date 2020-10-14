package com.SmartManager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SmartManager.Model.User;
import com.SmartManager.Service.ContactService;

@Controller
public class SmartController {
	
	@Autowired
	private ContactService service;
	
	
	

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model,User user) {
		model.addAttribute("user",new User());
		user.setRole("General User");
		user.setEnabled(true);

		return "signup";
	}
	
	
}
