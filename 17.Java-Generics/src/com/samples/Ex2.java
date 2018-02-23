package com.samples;

class NewBox<T> {

	private T ele;

	public void set(T t) {
		this.ele = t;
	}

	public T get() {
		return ele;
	}

}

class Util {
	public static void addNumbers(NewBox<Number> box) {

	}

	public static void addStrings(NewBox<String> box) {

	}
}

public class Ex2 {

	public static void main(String[] args) {

		NewBox<String> newBox = new NewBox<String>();
		newBox.set("biryani");
		// newBox.set(1234);// compile-time error

		String item = newBox.get();
		System.out.println(item);

		Util.addNumbers(new NewBox<>()); // Type inference
		Util.addStrings(new NewBox<>());

	}

}
