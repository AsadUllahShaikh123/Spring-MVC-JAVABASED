package com.lover_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love_calculator.dto.UserDto;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String getHome(@ModelAttribute("userInfo") UserDto dto) {
		
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@ModelAttribute("userInfo") UserDto dto) {
		// writing values to the properties by fetching from the url.
		System.out.println("Name is :"+ dto.getName());
		System.out.println("Crush is :" + dto.getCrush());
		
		
		return "result-page";
	}
}
