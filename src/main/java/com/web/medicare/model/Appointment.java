package com.web.medicare.model;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
@EnableTransactionManagement
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "appointment_id")
	private int id;
	
	@Column(name = "appointment_category")
	private String category;
	
	@Column(name = "appointment_availability")
	private String availability;

	@Column(name = "appointment_price")
	private String price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", category=" + category + ", availability=" + availability + ", price=" + price
				+ "]";
	}
	
}
