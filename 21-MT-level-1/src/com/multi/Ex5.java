package com.multi;

/*
 * 
 *  Thread- life-cycle / states
 *  ----------------------------
 * 
 */

class PrintNumber implements Runnable {

	// READY_TO_RUN ===> RUNNING
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + " : " + i);

			/*
			 * RUNNING ==> NOT_READY_TO_RUN
			 * 
			 * 
			 */

		}

		// ==> DEAD
	}
}

public class Ex5 {

	public static void main(String[] args) {

		PrintNumber printNumber = new PrintNumber();

		Thread thread1 = new Thread(printNumber, "A"); // New
		Thread thread2 = new Thread(printNumber, "B");
		Thread thread3 = new Thread(printNumber, "C");

		thread1.start(); // New ===> READY_TO_RUN
		thread2.start();
		thread3.start();

		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + " : " + i);
		}

	}

}
