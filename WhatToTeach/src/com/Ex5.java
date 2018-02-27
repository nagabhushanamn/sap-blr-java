package com;

/*
 * 
 * Garbage Collection
 * ------------------
 * 
 * 
 * 
 */

class Person {
	int id;

	public Person(int id) {
		super();
		this.id = id;
	}

}

public class Ex5 {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.totalMemory());

		for (int i = 0; i < 1000000000L; i++) {
			Person person=new Person(i);
		}
		
		System.out.println(runtime.freeMemory());
		
		System.gc();
		runtime.gc();

		System.out.println(runtime.freeMemory());
		
		
	}

}
