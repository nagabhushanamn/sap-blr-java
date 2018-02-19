package com.app;

class A extends Object {
	public A(int a) {
		super();
		System.out.println("im A");
	}

}

class B extends A {
	public B(int a) {
		super(a);
		System.out.println("im B");
	}
}

class C extends B {
	public C(int a) {
		super(a);
		System.out.println("im C");
	}
}

public class Constructor_Flow_In_Inheritance {

	public static void main(String[] args) {

		C c = new C(100);

	}

}
