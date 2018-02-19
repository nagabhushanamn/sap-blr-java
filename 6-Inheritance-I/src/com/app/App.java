package com.app;

import java.util.Scanner;

import com.app.emp.JSEmployee;
import com.app.emp.JavaEmployee;

public class App {

	public static void main(String[] args) {

		JavaEmployee javaEmployee = new JavaEmployee(101, "X");
		System.out.println(javaEmployee);

		JSEmployee jsEmployee = new JSEmployee(102, "Y");

		// -----------------------------------------------------

		// javaEmployee.id = 0;
		// javaEmployee.name = "";

		// -----------------------------------------------------

		System.out.println(javaEmployee);

	}

}
