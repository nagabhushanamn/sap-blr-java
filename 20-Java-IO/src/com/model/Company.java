package com.model;

import java.io.Serializable;

public class Company implements Serializable {

	private String name;
	private Location location = new Location("Ameriaca");

	public Company(String name) {
		super();
		this.name = name;
	}

}
