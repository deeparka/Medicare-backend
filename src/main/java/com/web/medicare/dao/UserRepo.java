package com.web.medicare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.medicare.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	List<User> findByEmail(String email);
}
