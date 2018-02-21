package com;

class Employee {
	void doWork() {
		System.out.println("Emp working....");
	}
}

public class Try_Catch_Ex {

	public static void main(String[] args) {

		System.out.println("A");

		try {

			System.out.println("B");
			int arith = 1 / 1;
			int[] arr = { 10, 20 };
			System.out.println(arr[0]);
			Employee emp = new Employee();
			emp.doWork();
			System.out.println("C");

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // JDK 1.7
			System.out.println("D");
			System.out.println("Ex-" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
		}

		System.out.println("E");

	}

}
