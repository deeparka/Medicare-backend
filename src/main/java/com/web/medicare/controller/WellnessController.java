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

import com.web.medicare.dao.WellnessRepo;
import com.web.medicare.model.Wellness;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081")
public class WellnessController {
	
	@Autowired
	WellnessRepo wellnessRepo;
	
	@PostMapping(path="/wellness/add")
	public Wellness addwellness(@RequestBody Wellness wellness) {
		wellnessRepo.save(wellness);
		return wellness;
	}
	
	@GetMapping(path="/wellnesses")
	@ResponseBody
	public List<Wellness> getwellness() {
		return wellnessRepo.findAll();
	}
	
	@PutMapping(path="/wellness/update/{id}")
	public Wellness updatewellness(@RequestBody Wellness wellness) {
		wellnessRepo.save(wellness);
		return wellness;
	}
	
	@DeleteMapping(path = "/wellness/delete/{id}")
	public String deletewellnessById(@PathVariable("id") int id) {
		wellnessRepo.deleteById(id);
		return id + " is deleted";
	}
	
}
