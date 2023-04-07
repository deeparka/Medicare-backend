package com.web.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.medicare.model.Wellness;

@Repository
public interface WellnessRepo extends JpaRepository<Wellness, Integer> {
	Wellness findByName(String name);
}
