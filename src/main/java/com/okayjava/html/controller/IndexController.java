package com.okayjava.html.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okayjava.html.entity.User;
import com.okayjava.html.service.UserService;

@RestController
public class IndexController {
	
	@Autowired
	UserService userServ;

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@PostMapping("/register")
	public User userRegistration(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());

		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("lastname", user.getLastname());
		return userServ.saveUserInfo1(user);
	}
}
