package com.multi;

public class Ex3 {

	public static void main(String[] args) {

		Runnable r = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " working...");
		};
		
		Thread thread = new Thread(r,"slave");
		thread.start();

	}

}
