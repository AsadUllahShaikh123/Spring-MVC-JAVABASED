package com.lover_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String getHome() {
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@RequestParam String name, @RequestParam String crush,Model model) {
		System.out.println("Name is :"+ name);
		System.out.println("Crush is :" + crush);
		
		model.addAttribute("name",name);
		model.addAttribute("crush",crush);
		return "result-page";
	}
}
