package com.max.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.store.models.Users;
import com.max.store.repos.UsersRepo;

@Service
public class UserService {

	@Autowired
	private UsersRepo usersrepo;
	
	public List<Users> getUsers() {
		return usersrepo.findAll();
	}
	public Users addUSers(Users user) {
		return usersrepo.save(user);
	}
}
