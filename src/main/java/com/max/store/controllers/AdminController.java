package com.max.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.store.models.Admins;
import com.max.store.services.AdminService;

@RestController
@RequestMapping("/admin")
//@CrossOrigin("*")
public class AdminController {
	@Autowired
	private AdminService adminservice;

	@GetMapping("/getall")
	public List<Admins> Getall() {
		return adminservice.getAdmins();
	}
	@PostMapping("/add")
	public Admins Addadmin(@RequestBody Admins admin){
		return adminservice.addAdmins(admin);
	}
	
}
