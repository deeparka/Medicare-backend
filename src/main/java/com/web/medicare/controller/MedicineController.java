package com.web.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

import com.web.medicare.dao.MedicineRepo;
import com.web.medicare.model.Medicine;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081")
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
	
	@GetMapping(path="/medicines/name")
	@ResponseBody
	public List<Medicine> getMedicineByNameSorted() {
		return medicineRepo.findAll(Sort.by("name"));
	}
	
	@GetMapping(path="/medicines/category")
	@ResponseBody
	public List<Medicine> getMedicineByCategorySorted() {
		return medicineRepo.findAll(Sort.by("category"));
	}
	
	@GetMapping(path="/medicines/price")
	@ResponseBody
	public List<Medicine> getMedicineByPriceSorted() {
		return medicineRepo.findAll(Sort.by("price"));
	}
	
	@GetMapping(path="/medicine/{name}")
	@ResponseBody
	public Medicine getMedicineByName(@PathVariable("name") String name) {
		return medicineRepo.findMedicineByName(name);
	}
	
	@PutMapping(path="/medicine/update/{id}")
	public Medicine updateMedicine(@RequestBody Medicine medicine) {
		medicineRepo.save(medicine);
		return medicine;
	}
	
	@DeleteMapping(path = "/medicine/delete/{id}")
	public String deleteMedicineById(@PathVariable("id") int id) {
		medicineRepo.deleteById(id);
		return id + " is deleted";
	}
	
}
