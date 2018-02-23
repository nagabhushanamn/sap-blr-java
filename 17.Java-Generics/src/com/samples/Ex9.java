package com.samples;

import java.util.ArrayList;
import java.util.List;

class Container<T> {
	T t;
}

class Util3 {
	public static void test(Container<Number> container) {
	}
}

class A1<T> {

}

class B1<T> extends A1<T> {

}

class C1<T> extends B1<T> {

}

public class Ex9 {

	public static void main(String[] args) {

		// Container<Number> contWithNumber = new Container<>();
		// Util3.test(contWithNumber);
		//
		// Container<Integer> contWithInteger = new Container<>();
		// Util3.test(contWithInteger);

		// -------------------------------------------------

		// List<String> ls=new ArrayList<String>();
		// List<Object> lo=ls;
		// lo.add(new Object());
		//
		// String s=ls.get(0);

		// ------------------------------------------------------

		// C1<String> c1 = new C1<String>();
		// B1<String> b1=c1;

		// ---------------------------------------------------------
		//
		// PayloadList<Integer,String> pl=null;
		// List<String> list=pl;

		// ------------------------------------------------------

	}

}
//
// interface PayloadList<E, P> extends List<E> {
// void setPayload(int index, P val);
// }
