package com;

import java.util.concurrent.TimeUnit;

// producer & consumer pattern with wait & notify methods

public class Ex7 {

	private static int count = -1;
	private static int BUFFER_SIZE = 10;
	private static final int[] BUFFER = new int[BUFFER_SIZE];

	private static final Object LOCK = new Object();

	public static boolean isFull() {
		return count == (BUFFER_SIZE - 1);
	}

	public static boolean isEmpty() {
		return count >= -1;
	}

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	// ---------------------------------------------------------

	private static class Produce {
		public void produce() throws InterruptedException {
			synchronized (LOCK) {
				while (true) {
					if (isFull()) {
						printMessage("buffer-full, going to wait");
						try {
							LOCK.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					++count;
					BUFFER[count] = (int) (Math.random() * 100);
					TimeUnit.SECONDS.sleep(2);
					printMessage("produced " + BUFFER[count] + "& notifying consumer");
					LOCK.notify();
				}
			}
		}
	}

	private static class Consume {
		public void consume() {
			synchronized (LOCK) {
				while (true) {
					if (isEmpty()) {
						printMessage("buffer-empty, going to wait");
						try {
							LOCK.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					printMessage("consumed " + BUFFER[count] + " & notifying producer");
					BUFFER[count] = 0;
					count--;
					LOCK.notify();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Produce produce = new Produce();
		Consume consume = new Consume();

		Runnable p = () -> {
			try {
				produce.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable c = () -> {
			consume.consume();
		};

		// --------------------------------------------

		Thread pThread = new Thread(p, "producer");
		Thread cThread = new Thread(c, "consumer");

		// -------------------------------------------

		cThread.start();
		TimeUnit.SECONDS.sleep(3);
		pThread.start();

	}

}
