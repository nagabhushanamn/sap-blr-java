package com.patterns.creational;

final class Sun {
	private static Sun sun;

	private Sun() {
	}

	public static Sun getSun() {
		if (sun == null) {
			sun = new Sun(); // lazy instance
		}
		return sun;
	}
}

public class Singleton_Ex {

	public static void main(String[] args) {

		// country-1
		// ----------------------------------
		Sun sun1 = Sun.getSun();
		// ----------------------------------

		// country-2
		// ----------------------------------
		Sun sun2 = Sun.getSun();
		// ----------------------------------

		System.out.println(sun1 == sun2);

	}

}
