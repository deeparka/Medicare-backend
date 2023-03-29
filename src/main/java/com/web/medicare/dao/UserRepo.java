package com.web.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.medicare.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
