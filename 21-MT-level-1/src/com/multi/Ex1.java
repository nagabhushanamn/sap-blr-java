package com.multi;

class Work1 implements Runnable {
	public void doWork() {
		String threadName = Thread.currentThread().getName();
		System.out.println("work1 by " + threadName);
	}

	@Override
	public void run() {
		doWork();
	}
}

public class Ex1 {

	public static void main(String[] args) {

		String threadName = Thread.currentThread().getName();

		System.out.println(threadName + " creating/starting new thread..");
		Work1 work1 = new Work1();
		Thread thread = new Thread(work1);
		thread.start();
		System.out.println(threadName + " cont... to do other work..");

	}

}
