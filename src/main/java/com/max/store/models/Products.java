package com.max.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;
	private String product_name;
	private String product_desc;
	private float product_price;
	private String product_logo_url;
	private String product_cover_1;
	private String product_cover_2;
	private String product_cover_3;
	private Long vendor_id;
	
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public String getProduct_logo_url() {
		return product_logo_url;
	}
	public void setProduct_logo_url(String product_logo_url) {
		this.product_logo_url = product_logo_url;
	}
	public String getProduct_cover_1() {
		return product_cover_1;
	}
	public void setProduct_cover_1(String product_cover_1) {
		this.product_cover_1 = product_cover_1;
	}
	public String getProduct_cover_2() {
		return product_cover_2;
	}
	public void setProduct_cover_2(String product_cover_2) {
		this.product_cover_2 = product_cover_2;
	}
	public String getProduct_cover_3() {
		return product_cover_3;
	}
	public void setProduct_cover_3(String product_cover_3) {
		this.product_cover_3 = product_cover_3;
	}
	public Long getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(Long vendor_id) {
		this.vendor_id = vendor_id;
	}
	
	
}
