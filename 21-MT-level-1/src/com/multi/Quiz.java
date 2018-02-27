package com.multi;

class Q implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "-> " + " do u need tea ?");
	}
}

public class Quiz {

	public static void main(String[] args) {

		Thread thread = new Thread(new Q(),"Thread-1");
		thread.start(); // New-stack

		System.out.println(Thread.currentThread().getName() + "-> do u need coffee?");

	}

}
