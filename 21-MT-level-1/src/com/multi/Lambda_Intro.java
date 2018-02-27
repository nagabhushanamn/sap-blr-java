package com.multi;

interface Prdeicate {
	boolean test(int n);
}

public class Lambda_Intro {

	public static void main(String[] args) {

		Prdeicate prdeicate0 = new Prdeicate() {
			@Override
			public boolean test(int n) {
				return false;
			}
		};

		Prdeicate prdeicate = (int n) -> {
			return n % 2 == 0;
		};

		System.out.println(prdeicate.test(12));

	}

}
