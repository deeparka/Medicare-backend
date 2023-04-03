package com.web.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.medicare.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
