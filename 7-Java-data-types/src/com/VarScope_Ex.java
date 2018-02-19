package com;

class Employee {

	static int helloCount = 0; // class/static variable

	private String name;
	// int helloCount = 0; // instance/object variable

	public Employee(String name) {
		this.name = name;
	}

	public void sayHello() {
		// int helloCount=0; // local variable
		// helloCount++;
		helloCount++;
		System.out.println(this.name + " hello..." + helloCount);
	}
}

public class VarScope_Ex {

	public static void main(String[] args) {
		Employee employee1 = new Employee("X");
		Employee employee2 = new Employee("Y");

		employee1.sayHello();
		employee2.sayHello();
		employee2.sayHello();
	}

}
