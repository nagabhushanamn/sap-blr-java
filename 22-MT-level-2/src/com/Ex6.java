package com;

import java.util.concurrent.TimeUnit;

// How to stop thread ?

public class Ex6 {

	public static void main(String[] args) throws InterruptedException {

		Runnable playTask = () -> {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("playing...");
			}
		};

		Thread playerThread = new Thread(playTask);
		playerThread.start();

		TimeUnit.SECONDS.sleep(5);

		playerThread.interrupt();

	}

}
