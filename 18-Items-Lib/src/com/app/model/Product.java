package com.app.model;

import java.time.LocalDate;

public class Product {

	private String name;
	private double price;
	private LocalDate makeDate;
	private ProductType type;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price, LocalDate makeDate, ProductType type) {
		super();
		this.name = name;
		this.price = price;
		this.makeDate = makeDate;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", makeDate=" + makeDate + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getMakeDate() {
		return makeDate;
	}

	public ProductType getType() {
		return type;
	}

}
