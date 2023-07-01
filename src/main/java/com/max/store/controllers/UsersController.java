package com.max.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.store.models.Users;
import com.max.store.services.UserService;

@RestController
@RequestMapping("/user")
//@CrossOrigin("*")
public class UsersController {
	@Autowired
	private UserService userservice;
	@GetMapping("/getall")
	public List<Users> Getusers() {
		return userservice.getUsers();
	}
	@PostMapping("/add")
	public Users AddUser(@RequestBody Users user) {
		return userservice.addUSers(user);
	}
}
