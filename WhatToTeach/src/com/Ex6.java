package com;

import java.util.Arrays;

public class Ex6 {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = new int[10];

		System.arraycopy(a1, 0, a2, 0, 5);

		System.out.println(Arrays.toString(a2));

	}

}
