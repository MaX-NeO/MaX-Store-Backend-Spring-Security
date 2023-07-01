package com.max.store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.store.models.Products;
import com.max.store.repos.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productrepo;

	public List<Products> getProduct() {
		return productrepo.findAll();
	}

	public Optional<Products> findproductbyID(Long id) {
		return productrepo.findById(id);
	}

	public Products addProduct(Products product) {
		return productrepo.save(product);
	}

	public String editProduct(Products product, Long id) {
		Products productx = productrepo.findById(id).orElse(null);
		if (productx == null) {
			return "invalid_product";
		} else {
			productx.setProduct_name(product.getProduct_name());
			productx.setProduct_price(product.getProduct_price());
			productx.setProduct_desc(product.getProduct_desc());
			productx.setProduct_logo_url(product.getProduct_logo_url());
			productx.setProduct_cover_1(product.getProduct_cover_1());
			productx.setProduct_cover_2(product.getProduct_cover_2());
			productx.setProduct_cover_3(product.getProduct_cover_3());
			productrepo.saveAndFlush(productx);
			return "product_edited";
		}
	}

	public String deleteProduct(Long id) {
		productrepo.deleteById(id);
		return "product_deleted";
	}
}
