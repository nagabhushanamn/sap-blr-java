package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Super {
	void abc() {

	}
}

class Sub extends Super {

	@Override
	void abc() {
		//
	}
}

class Lib {

	@Deprecated
	static void v1() {
		System.out.println("v1()....");
	}

	static void v2() {
		System.out.println("v2()....");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Lib.v1();
		Lib.v2();

		Date date = new Date();
		System.out.println(date.getYear());

		@SuppressWarnings("rawtypes")
		List list = new ArrayList();

	}

}
