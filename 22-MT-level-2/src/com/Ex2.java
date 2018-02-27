package com;

import java.util.concurrent.TimeUnit;

class Building {
	public static synchronized void room1() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " - using room1");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " - exiting room1");
	}

	public static synchronized void room2() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " - using room2");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " - exiting room2");
	}

	public static void room3() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " - using room3");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " - exiting room3");
	}

}

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable1 = () -> {
			Building.room1();
		};
		Runnable runnable2 = () -> {
			Building.room2();
		};
		Runnable runnable3 = () -> {
			Building.room3();
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
