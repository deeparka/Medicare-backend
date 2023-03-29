package com.web.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.medicare.model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Integer> {

}
