package com.web.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.medicare.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
