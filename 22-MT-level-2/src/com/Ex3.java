package com;

import java.util.concurrent.TimeUnit;

// synchronized keyword with instance methods

class NewBuilding {
	String name;

	public NewBuilding(String name) {
		this.name = name;
	}

	public synchronized void room1() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " - using room1 in " + this.name);
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " - left room1 in " + this.name);
	}

	public synchronized void room2() {
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

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {

		NewBuilding building1 = new NewBuilding("B1");
		NewBuilding building2 = new NewBuilding("B2");

		Runnable runnable1 = () -> {
			building1.room1();
		};
		Runnable runnable2 = () -> {
			building2.room1();
		};
		Runnable runnable3 = () -> {
			building1.room2();
		};

		Thread thread1 = new Thread(runnable1, "A");
		Thread thread2 = new Thread(runnable2, "B");
		Thread thread3 = new Thread(runnable3, "C");
		thread1.start();
		TimeUnit.SECONDS.sleep(1);
		thread2.start();
		TimeUnit.SECONDS.sleep(1);
		thread3.start();

	}

}
