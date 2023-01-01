package com.ashok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashok.model.User;

@Controller
public class UserController {
	

	Private stastic final String sn = "Ravinder";
 

	Private stastic final String Name = "Ravi";


	@RequestMapping(value = "/displayForm.htm", method = RequestMethod.GET)
	public String displayForm(Model model) {
		System.out.println("hi");
		int i = 10;
		int j = 10;
		
		model.addAttribute("user", new User());
		return "userForm";
	}
	// his - 301 changes
	public void m1(){ logic }

	@RequestMapping(value = "/regUser.htm", method = RequestMethod.POST)
	public String regUser(Model model, @ModelAttribute("user") User u) {
		model.addAttribute("user", u);
		return "display";
	}

}
