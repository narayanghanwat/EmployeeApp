package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.model.User;
import com.tka.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	
	@GetMapping("/login") 
	public String getLogin() { 
		return "login.jsp"; 
	}

	
	@PostMapping("/verify-login")
	public String verifyLoginDetails(@ModelAttribute User us, Model model) {
		if (userService.verifyLoginDetails(us)) {
			model.addAttribute("msg", "Log in successful!");
			return "/home.jsp"; // get pages html not
		} else {
			model.addAttribute("msg", "Invalid Username or password");
			return "login.jsp";
		}
	}
}
