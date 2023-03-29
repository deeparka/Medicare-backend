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
	
	@PostMapping(path="/medicine/add")
	public User addMedicine(@RequestBody User user) {
		userRepo.save(user);
		return user;
	}
	
	@GetMapping(path="/medicines")
	@ResponseBody
	public List<User> getMedicine() {
		return userRepo.findAll();
	}
	
	@PutMapping(path="/medicine/update")
	public User updateMedicine(@RequestBody User user) {
		userRepo.save(user);
		return user;
	}
}
