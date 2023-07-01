package com.max.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admins {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long admin_id;
private String admin_username;
private String admin_password;
private int admin_type;

public Long getAdmin_id() {
	return admin_id;
}
public void setAdmin_id(Long admin_id) {
	this.admin_id = admin_id;
}
public String getAdmin_username() {
	return admin_username;
}
public void setAdmin_username(String admin_username) {
	this.admin_username = admin_username;
}
public String getAdmin_password() {
	return admin_password;
}
public void setAdmin_password(String admin_password) {
	this.admin_password = admin_password;
}
public int getAdmin_type() {
	return admin_type;
}
public void setAdmin_type(int admin_type) {
	this.admin_type = admin_type;
}
}
