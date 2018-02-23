package com.samples;

interface A {

}

interface B {

}

interface C {

}

class P implements A, B {

}

class Q implements A, B, C {

}

class X<T extends A & B & C> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

class Y<P extends A & B & C> extends X<P> {

}

public class Ex7 {

	public static void main(String[] args) {

		X<Q> x = new X<Q>();

	}

}
