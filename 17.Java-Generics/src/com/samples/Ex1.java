package com.samples;

class Box {

	Object element;

	public void set(Object ele) {
		this.element = ele;
	}

	public Object get() {
		return this.element;
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Box boxWithStrings = new Box();
		boxWithStrings.set("biryani");

		boxWithStrings.set(12345);

		String item = (String) boxWithStrings.get();
		System.out.println(item);

	}

}
