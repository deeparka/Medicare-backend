package com.web.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.medicare.dao.UserRepo;
import com.web.medicare.model.User;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081")
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
	
	@GetMapping(path="/user/{email}")
	@ResponseBody
	public void getUserByEmail(@PathVariable("email") String email) {
		userRepo.findByEmail(email);
	}
	
	@PutMapping(path="/user/update/{id}")
	public User updateUser(@RequestBody User user) {
		userRepo.save(user);
		return user;
	}
	
	@DeleteMapping(path = "/user/delete/{id}")
	public String deleteUserById(@PathVariable("id") int id) {
		userRepo.deleteById(id);
		return id + " is deleted";
	}
}
