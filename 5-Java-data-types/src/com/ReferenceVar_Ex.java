package com;

class Mobile {
	String model;

	public Mobile(String model) {
		this.model = model;
	}
}

class Person {

	String name; // reference
	int age; // primitive
	Mobile mobile; // reference

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

interface Wheel {
	int RADIUS = 10;

	void rotate();
}

class MRFWheel implements Wheel {
	public void rotate() {
		System.out.println("MRF wheel rotating");
	}
}

class CEATWheel implements Wheel {
	public void rotate() {
		System.out.println("CEATÏ wheel rotating");
	}
}

public class ReferenceVar_Ex {

	public static void main(String[] args) {
		//
		// Person person1 = new Person("Nag");
		// Mobile mobile=new Mobile("Samsung A7");
		// person1.mobile=mobile;
		//
		// Person person2 = new Person("Ria", 3);

		// ----------------------------------------

		// Wheel wheel=null;
		// wheel=new MRFWheel();
		// wheel=new CEATWheel();
		
		//---------------------------------------------

	}

}
