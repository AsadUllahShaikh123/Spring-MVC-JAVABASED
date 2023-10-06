package com.lover_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love_calculator.dto.UserDto;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String getHome(Model model) {
		// read the data from dto before loading the page.
		UserDto dto = new UserDto();
		model.addAttribute("userInfo",dto);
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(UserDto dto ,Model model) {
		// writing values to the properties by fetching from the url.
		System.out.println("Name is :"+ dto.getName());
		System.out.println("Crush is :" + dto.getCrush());
		
		model.addAttribute("user",dto);
		return "result-page";
	}
}
