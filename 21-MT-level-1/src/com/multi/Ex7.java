package com.multi;

import java.util.concurrent.TimeUnit;

public class Ex7 {

	public static void main(String[] args) {

		Runnable tnrWork = () -> {
			System.out.println("tnr - finding soln for stud problem");
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("tnr  - this soln for pour problem..");
		};

		Runnable studWork = () -> {
			System.out.println("stud working on java problem..");
			System.out.println("got prob, cant cont...further..so joining tnr thread");
			Thread tnrThread = new Thread(tnrWork);
			tnrThread.start();
			try {
				tnrThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hey tnr, thank for soln..");
		};

		Thread studThread = new Thread(studWork);
		studThread.start();

	}

}
