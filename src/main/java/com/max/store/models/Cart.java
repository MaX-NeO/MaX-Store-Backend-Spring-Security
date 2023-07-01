package com.max.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
@Id
	private Long cart_id;
	private String cart_products_id;
	
	public Long getCart_id() {
		return cart_id;
	}
	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}
	public String getCart_products_id() {
		return cart_products_id;
	}
	public void setCart_products_id(String cart_products_id) {
		this.cart_products_id = cart_products_id;
	}
	

}
