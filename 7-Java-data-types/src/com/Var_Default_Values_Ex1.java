package com;

/*
 * 
 * default values for static & instance variables
 * 
 * ==> integral ==> 0
 * ==> real     ==> 0.0
 * ==> char     ==> '\u0000'
 * ==> boolean  ==> false
 * 
 * ==> eference ==> null
 * 
 */

class Abc {
	static int staIntVar;
	static {
		System.out.println("Abc-static block..");
		// why we need ?
		/*
		 * ==> to initialize static variable(s) by executing some expressions, once
		 * while class loading into JVM
		 * 
		 */
		staIntVar = 10 + 20 + 30;
	}
	int insVar;

	public Abc(int insVar) {
		this.insVar = insVar;
	}

}

public class Var_Default_Values_Ex1 {
	static {
		System.out.println("Var_Default_Values_Ex -static block..");
	}

	public static void main(String[] args) {
		System.out.println("main()");
		System.out.println(Abc.staIntVar);

		Abc abc = new Abc(70);
		System.out.println(abc.insVar);

		int locVar = 80;
		System.out.println(locVar);

		if (true) {
			int locVar2 = 90;
		}
		// System.out.println(locVar2);

	}

}
