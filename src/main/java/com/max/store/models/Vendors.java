package com.max.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vendor_id;
	private String vendor_name;
	private Long vendor_mobile;
	private String vendor_email;
	private String vendor_password;
	
	public Long getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(Long vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public Long getVendor_mobile() {
		return vendor_mobile;
	}
	public void setVendor_mobile(Long vendor_mobile) {
		this.vendor_mobile = vendor_mobile;
	}
	public String getVendor_email() {
		return vendor_email;
	}
	public void setVendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}
	public String getVendor_password() {
		return vendor_password;
	}
	public void setVendor_password(String vendor_password) {
		this.vendor_password = vendor_password;
	}
	
}
