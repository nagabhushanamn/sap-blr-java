package com.samples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// wildcard generics

public class Ex10 {

	// UnBounded Type param
	public static void printList(List<?> list) {
		for (Object elem : list) {
			System.out.println(elem);
		}
		System.out.println();
	}

	// Upper Bounded wildcard
	public static double sumList(List<? extends Number> list) {
		double sum = 0.0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}

	// Lower Bounded wildcard
	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3);
		List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
		List<String> strings = Arrays.asList("one", "two", "three");

		// -------------------------------------------------------------
		// printList(integers);
		// printList(doubles);
		// printList(strings);

		// -------------------------------------------------------------

		// System.out.println(sumList(integers));
		// System.out.println(sumList(doubles));

		// -------------------------------------------------------------

		List<Integer> integers2 = new ArrayList<>();
		List<Number> numbers = new ArrayList<>();
		List<Object> objects = new ArrayList<>();
		addNumbers(objects);

		System.out.println(objects);

	}

}
