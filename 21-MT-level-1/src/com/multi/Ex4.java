package com.multi;

class Work implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " working...");
	}
}

class Worker extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " working...");
	}
}

public class Ex4 {

	public static void main(String[] args) {

		Worker worker = new Worker(); // Runnable + Thread
		worker.start();

		Work work = new Work(); // Runnable
		Thread thread = new Thread(work);
		thread.start();

	}

}
