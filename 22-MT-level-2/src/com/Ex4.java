package com;

import java.util.concurrent.TimeUnit;

// synchronized keyword with instance methods

class Palace {

	private static Object commonKey = new Object();

	String name;

	public Palace(String name) {
		this.name = name;
	}

	public void room1() {
		synchronized (commonKey) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " - using room1 in " + this.name);
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " - left room1 in " + this.name);
		}
	}

	public void room2() {
		synchronized (commonKey) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " - using room2 in " + this.name);
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " - left room2 in " + this.name);
		}
	}

}

public class Ex4 {

	public static void main(String[] args) throws InterruptedException {

		Palace building1 = new Palace("B1");
		Palace building2 = new Palace("B2");

		Runnable runnable1 = () -> {
			building1.room1();
		};
		Runnable runnable2 = () -> {
			building2.room2();
		};

		Thread thread1 = new Thread(runnable1, "A");
		Thread thread2 = new Thread(runnable2, "B");
		thread1.start();
		TimeUnit.SECONDS.sleep(1);
		thread2.start();

	}

}
