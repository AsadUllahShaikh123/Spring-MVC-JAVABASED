package com.lover_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love_calculator.dto.UserRegisterationDto;

@Controller
public class RegisterationController {

	@RequestMapping("/register")
	public String showRegisterationPage(@ModelAttribute("user_registeration") UserRegisterationDto dto) {
		return "user-registeration-page";
	}
	
}
