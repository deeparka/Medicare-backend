package com.web.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.medicare.dao.MedicineRepo;
import com.web.medicare.model.Medicine;

@RestController
public class MedicineController {
	
	@Autowired
	MedicineRepo medicineRepo;
	
	@PostMapping(path="/medicine/add")
	public Medicine addMedicine(@RequestBody Medicine medicine) {
		medicineRepo.save(medicine);
		return medicine;
	}
	
	@GetMapping(path="/medicines")
	@ResponseBody
	public List<Medicine> getMedicine() {
		return medicineRepo.findAll();
	}
	
	@PutMapping(path="/medicine/update/{id}")
	public Medicine updateMedicine(@RequestBody Medicine medicine) {
		medicineRepo.save(medicine);
		return medicine;
	}
	
}
