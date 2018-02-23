package com.app.model;

import java.time.LocalDate;

public class Person {

	private String name;
	private String email;
	private Gender gender;
	private LocalDate dob;

	public Person() {
	}

	public Person(String name, String email, Gender gender, LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", gender=" + gender + ", dob=" + dob + "]";
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Gender getGender() {
		return gender;
	}

	public LocalDate getDob() {
		return dob;
	}

}
