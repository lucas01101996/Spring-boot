package com.example.projeto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.projeto1.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("/user") // mapeia a rota
	public String getUsers(Model model) {
		model.addAttribute("usersList",this.userService.findAll());
		
		return "user";
	}
}
