package com.model;

import java.io.Serializable;

public class Laptop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 123456789023456789L;
	
	private int serial;
	private String model;
	private transient double price;
	private double discount=1000.00;
	private Company company=new Company("Apple");

	public Laptop(int serial, String model, double price) {
		super();
		this.serial = serial;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [serial=" + serial + ", model=" + model + ", price=" + price + "]";
	}

}
