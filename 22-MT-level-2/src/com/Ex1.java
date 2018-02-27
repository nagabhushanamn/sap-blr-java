package com;

class Counter {
	private long count = 0;

	public synchronized void increment() {
		count++; // Read --> increment by 1 --> write
	}

	public long getCount() {
		return count;
	}
}

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		// ------------------------------------------
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};
		// ------------------------------------------

		Thread[] threads = new Thread[1000];
		for (int i = 0; i < 1000; i++) {
			threads[i] = new Thread(runnable);
			threads[i].start();
		}

		// ------------------------------------------

		for (int i = 0; i < 1000; i++) {
			threads[i] = new Thread(runnable);
			threads[i].join();
		}

		// ---------------------------------------------

		System.out.println(counter.getCount()); // 1000 * 1000 = 1000000

	}

}
