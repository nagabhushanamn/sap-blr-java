package com.multi;

// way-1
//class SomeWork implements Runnable {
//	@Override
//	public void run() {
//		System.out.println("some work by thread..");
//	}
//}

public class Ex2 {

	public static void main(String[] args) {

		// SomeWork target = new SomeWork();

		// way-2 : Anonymous class

		// Runnable runnable = new Runnable() {
		// @Override
		// public void run() {
		// System.out.println("work.....");
		// }
		// };

		// way-3: Java-8 , using lambda expression
		Runnable runnable = () -> {
			System.out.println("work...");
		};

		Thread thread = new Thread(runnable);
		thread.start();

	}

}
