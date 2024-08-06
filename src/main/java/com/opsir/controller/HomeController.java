package com.opsir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.opsir.entity.User;
import com.opsir.services.CustomUserDetailsService;
import com.opsir.services.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	

	@GetMapping("/userForm")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	/*
	 * @PostMapping("/submitForm") public String submitForm(@ModelAttribute User
	 * user, Model model) { model.addAttribute("user", user);
	 * 
	 * User save = userService.addUser(user);
	 * 
	 * System.out.println(save);
	 * 
	 * return "homePage"; }
	 */

	@PostMapping("/submit")
	public String submitFormInner(@ModelAttribute User user, Model model) {
		// Process the user data (e.g., save to database)

		model.addAttribute("user", user);

		User save = userService.addUser(user);

		System.out.println(save);

		model.addAttribute("message", "User submitted successfully!");

		return "homePage"; // Make sure you have a result.html template
	}

	@GetMapping("/users")
	public String listUsers(Model model) {

		List<User> users = userService.getAllUsers();

		model.addAttribute("users", users);
		return "userList";
	}

	

}
