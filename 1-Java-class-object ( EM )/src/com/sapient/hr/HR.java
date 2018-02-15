package com.sapient.hr;

import com.sapient.emp.Employee;

public class HR {

	public static void manageEmployees() {

		/*
		 * in java , object creation 2 step process
		 * 
		 * step-1 : dynamic memory allocation from heap-memory ==> 'new' keyword 
		 *  step-2 : initialize that memory with obj's data ==> constructor
		 * 
		 * obj ===> new Constructor();
		 * 
		 */
		
		Employee.tnrName="Nag";

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "A";
		e1.salary = 1000.00;
		
		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "B";
		e2.salary = 1000.00;

		Employee.doTraining();
		
		e1.doListenAndWork();
		e2.doListenAndWork();
		
	}

}
