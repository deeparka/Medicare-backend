package com.web.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.medicare.dao.UserRepo;
import com.web.medicare.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@PostMapping(path="/user/add")
	public User addUser(@RequestBody User user) {
		userRepo.save(user);
		return user;
	}
	
	@GetMapping(path="/users")
	@ResponseBody
	public List<User> getUser() {
		return userRepo.findAll();
	}
	
	@PutMapping(path="/user/update")
	public User updateUser(@RequestBody User user) {
		userRepo.save(user);
		return user;
	}
}
