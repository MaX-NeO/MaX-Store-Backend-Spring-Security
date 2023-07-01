package com.max.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Wishlist {
@Id
	private Long wishlist_id;
	private String wishlist_products_id;
	
	public Long getWishlist_id() {
		return wishlist_id;
	}
	public void setWishlist_id(Long wishlist_id) {
		this.wishlist_id = wishlist_id;
	}
	public String getWishlist_products_id() {
		return wishlist_products_id;
	}
	public void setWishlist_products_id(String wishlist_products_id) {
		this.wishlist_products_id = wishlist_products_id;
	}
}
