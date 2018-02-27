package com.multi;

import java.time.LocalTime;

// sleep

public class Ex6 {

	public static void main(String[] args) throws InterruptedException {

		// System.out.println("Tea");
		// Thread.sleep(5000); // cause current thread do nothing for specified time
		// System.out.println("Veg-burger");

		// ----------------------------------------------------------

		Runnable runnable = () -> {
			while (true) {
				LocalTime time = LocalTime.now();
				System.out.println(time);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread timeThread = new Thread(runnable);
		timeThread.start();

	}

}
