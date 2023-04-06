package com.web.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.medicare.model.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
