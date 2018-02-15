// package dec
package com.sapient.emp;

// import statements

// public type
public class Employee {

	// variables

	// a. class/static variables
	public final static String COMP_NAME = "SAPIENT";
	public static String tnrName;
	// b. obj/instance variable
	public int id;
	public String name;
	public double salary;

	// constructor
	public Employee() {
		System.out.println("Employee instance creatd.....");
	}

	// behav

	// a. class/static behav
	public static void doTraining() {
		System.out.println("Empoyeee :: doTraining()");
	}

	// b. obj/instance behav
	public void doListenAndWork() {
		System.out.println(this.name+ " :: doLientnAndWork()");
	}

	// inner types

}


// default type
class Abc {

}
