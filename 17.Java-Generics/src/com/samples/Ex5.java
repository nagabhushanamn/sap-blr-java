package com.samples;

import java.util.Arrays;
import java.util.List;

class Util1 {
	public static void printItems(List<Integer> list) {
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	public static <E> void printItems1(List<E> list) {
		for (E ele : list) {
			System.out.println(ele);
		}
	}

	public static <E> E reflect(E e) {
		return e;
	}

	public static <A, B> B m(A a, B b) {
		return b;
	}
}

public class Ex5 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Util1.printItems1(integers);

		List<String> strings = Arrays.asList("hello", "world");
		Util1.printItems1(strings);

		System.out.println(Util1.reflect(12));
		System.out.println(Util1.reflect("hello"));

		System.out.println(Util1.m("string", 123));
		System.out.println(Util1.m(123, "string"));

	}

}
