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

import com.web.medicare.dao.AppointmentRepo;
import com.web.medicare.model.Appointment;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081")
public class AppointmentController {
	
	@Autowired
	AppointmentRepo aptRepo;
	
	@PostMapping(path="/appointment/add")
	public Appointment addAppointment(@RequestBody Appointment appointment) {
		aptRepo.save(appointment);
		return appointment;
	}
	
	@GetMapping(path="/appointments")
	@ResponseBody
	public List<Appointment> getAppointment() {
		return aptRepo.findAll();
	}
	
	@PutMapping(path="/appointment/update/{id}")
	public Appointment updateAppointment(@RequestBody Appointment appointment) {
		aptRepo.save(appointment);
		return appointment;
	}
	
	@DeleteMapping(path = "/appointment/delete/{id}")
	public String deleteAppointmentById(@PathVariable int id) {
		aptRepo.deleteById(id);
		return id + " is deleted";
	}
}
