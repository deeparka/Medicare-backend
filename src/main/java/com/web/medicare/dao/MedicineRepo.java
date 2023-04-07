package com.web.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.medicare.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine, Integer> {
	Medicine findMedicineByName(String name);

}
