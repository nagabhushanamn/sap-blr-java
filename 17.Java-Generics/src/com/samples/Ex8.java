package com.samples;

class Box2<T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

public class Ex8 {

	public static void someMethod(Number n) {
	}

	public static void main(String[] args) {

		// field-level

		// Object someObject = new Object();
		// Integer someInetegr = new Integer(1234);
		// someObject = someInetegr; // implicit casting

		// ------------------------------------------

		// arg-level

		// someMethod(new Integer(123));
		// someMethod(new Double(123.00));

		// ------------------------------------------

	}

}
