package com.single;

import java.util.Scanner;

/*
 *  app:
 *  
 *  task-1 : get name from user and greet him/her
 *  task-2 : print number b/w 1-100
 * 
 */

class Task1 {
	public void doTask1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name?");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		sc.close();
	}
}

class Task2 {
	public void doTask2() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

public class Single_Thread_App_or_Process {
	public static void main(String[] args) {

		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start..");

		// step-1
		System.out.println("task-1");
		Task1 task1 = new Task1();
		task1.doTask1();
		// step-2
		System.out.println("task-2");
		Task2 task2 = new Task2();
		task2.doTask2();
		// step-n
		System.out.println("with other steps..");
		
		

	}
}
