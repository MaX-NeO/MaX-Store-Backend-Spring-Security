package com.max.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Offers {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long offer_id;
	private int offer_type;
	
	public Long getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(Long offer_id) {
		this.offer_id = offer_id;
	}
	public int getOffer_type() {
		return offer_type;
	}
	public void setOffer_type(int offer_type) {
		this.offer_type = offer_type;
	}
}
