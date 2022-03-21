package com.smg.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.smg.models.LoginModel;



@Controller
public class pageController {
	//Go to the login page
	@GetMapping("/login")
	public String goToLogin() {
		return "login";	
	}
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		//Check for errors
		if (bindingResult.hasErrors()) {
			//model.addAttribute("title", "Login Form");
			return "index";
		}

		return "index";
	}
	
	//go to the register page
	@GetMapping("/register")
	public String goToRegister() {
		return "index";	
	}
	
	//admin go to the login page
	@GetMapping("/adminlogin")
	public String goAdminLogin() {
		return "adminLogin";	
	}
}
