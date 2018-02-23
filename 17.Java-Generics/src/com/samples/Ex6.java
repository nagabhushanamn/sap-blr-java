package com.samples;

class Box1<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return this.t;
	}

	public <U extends Number> void inpect(U u) {
		System.out.println("T : " + t.getClass().getName());
		System.out.println("U : " + u.getClass().getName());
	}

}

public class Ex6 {

	public static void main(String[] args) {

		Box1<Integer> box1 = new Box1<Integer>();
		box1.set(new Integer(123));
		box1.inpect(123.00);

	}

}
