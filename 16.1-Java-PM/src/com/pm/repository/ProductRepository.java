package com.pm.repository;

import java.util.ArrayList;
import java.util.List;

import com.pm.model.Product;

public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	public void save(Product product) {
		// ..
	}
	public Product get(int id) {
		//..
		return null;
	}
	public void update(int id, double newPrice) {
		// ..
	}
	public void delete(int id) {
		// ..
	}
	public List<Product> findAll() {
		// ..
		return null;
	}
	public List<Product> sortBy(String propName) {
		// ..
		return null;
	}
}
