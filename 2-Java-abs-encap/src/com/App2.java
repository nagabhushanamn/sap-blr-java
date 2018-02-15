package com;

import emp.Employee;

public class App2 {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "A", 1000.00);

		// ---------------------------------------------
		// //
		// employee.salary=10000000000.00;
		// employee.bonus=-100;
		//
		// ---------------------------------------------

		employee.setSalary(5000.00);
		System.out.println(employee.getBonus());

	}

}
