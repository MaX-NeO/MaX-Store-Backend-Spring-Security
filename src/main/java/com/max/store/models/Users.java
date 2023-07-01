package com.max.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	private String user_firstname;
	private String user_lastname;
	private String user_email;
	private Long user_phone;
	private String user_passwrod;
	private String user_address;
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_firstname() {
		return user_firstname;
	}
	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}
	public String getUser_lastname() {
		return user_lastname;
	}
	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Long getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(Long user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_passwrod() {
		return user_passwrod;
	}
	public void setUser_passwrod(String user_passwrod) {
		this.user_passwrod = user_passwrod;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	
	
}
