package com.packt.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { 
	@RequestMapping("/")
	public String welcome(Model model){
		model.addAttribute("greeting", "Welcome to Library");
		model.addAttribute("tagline", "The one and only amazing library");
		
		return "welcome";
	}
}

