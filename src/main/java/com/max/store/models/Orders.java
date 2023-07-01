package com.max.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_id;
	private String order_date;
	private Float order_total;
	private Boolean order_status;
	private Long f_user_id;
	private Long f_product_id;
	
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public Float getOrder_total() {
		return order_total;
	}
	public void setOrder_total(Float order_total) {
		this.order_total = order_total;
	}
	public Boolean getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Boolean order_status) {
		this.order_status = order_status;
	}
	public Long getF_user_id() {
		return f_user_id;
	}
	public void setF_user_id(Long f_user_id) {
		this.f_user_id = f_user_id;
	}
	public Long getF_product_id() {
		return f_product_id;
	}
	public void setF_product_id(Long f_product_id) {
		this.f_product_id = f_product_id;
	}
}
