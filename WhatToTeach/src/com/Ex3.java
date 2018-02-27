package com;

public class Ex3 {

	public static void main(String... args) {

		int n1 = 12;
		int n2 = 13;
		int n3 = 14;
		int n4 = 14;

		// int[] intArray = { n1, n2, n3, n4 };
		display(n1, n2, n3, n4, 16, 17);

	}

	private static void display(int n1, int... nums) {
		for (int n : nums) {
			System.out.println(n);
		}
	}

}
