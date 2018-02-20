package com;

/*
 * 
 * problems with java code before JDK 1.5
 * ---------------------------------------
 * 
 * ==> can't ensure object type-safety
 * ==> without 'instanceof' condition, our code throws clss-cast exception
 * 
 * soln: use 'generics' featured ( introduced from 1.5 version
 * 
 * 
 * 
 */

interface Subject {
}

class Java implements Subject {
}

class JS implements Subject {
}

class Trainer<T extends Subject> {
	T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}
}

public class Generics_Ex {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<>();
		javaTrainer.setSubject(new Java());

		Trainer<JS> jsTrainer = new Trainer<>();
		jsTrainer.setSubject(new JS());

		// -----------------------------------
		// javaTrainer.setSubject(new JS()); // obj integrity danaged
		// -----------------------------------

		// in classroom
		Java java = javaTrainer.getSubject();
		System.out.println("happy learning with this java-tnr");

	}

}
