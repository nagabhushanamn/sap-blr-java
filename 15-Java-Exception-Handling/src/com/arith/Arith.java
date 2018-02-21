package com.arith;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter Num-1");
		int n1 = sc.nextInt();

		System.out.println("Enter Num-2");
		int n2 = sc.nextInt();

		// 1. Add
		System.out.println("1.Add");
		// 2. Sub
		System.out.println("2.Sub");

		try {
		// 3. Div
		System.out.println("3. Div");
		float result = n1 / n2; // throw new ArithException("/ by zery")
		System.out.println(result);
		}catch (Exception e) {
			
			// handling code
			/*
			 * ==> report to end user with friendly message
			 * ==> log error in log-file for future fix
			 * ==> re-throw to other module..
			 * 
			 */
			System.out.println("Ex-"+e.getMessage());
			
		}

		// 3. Mul
		System.out.println("4. Mul");

		System.out.println("good appln");
		

		sc.close();

	}

}
