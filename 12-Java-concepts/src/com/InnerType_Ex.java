package com;

/*
 *  inner/nested class
 *  --------------------
 *  
 *  1. static inner class
 *  2. non-static inner class
 *  3. local
 *  4. anonymous 
 *  
 *  why we need inner-class ?
 *  
 *  ==> for better association
 * 
 * 
 */

class Outer {

	// variables
	private static int outStaVar = 100;
	private int outInsVar = 12;

	// constructor
	// methods
	void outMethod() {
		Inner inner = new Inner();
		inner.m();
	}

	// inner types
	private class Inner {
		void m() {
			System.out.println(outStaVar);
			System.out.println(outInsVar);
		}
	}
}

public class InnerType_Ex {

	public static void main(String[] args) {

		// Outer.Inner inner = new Outer().new Inner(); // non-sattic
		// Outer.Inner inner = new Outer.Inner(); // static

		// -----------------------------------------

		// final int localVar = 100;
		//
		// class Local {
		// void m() {
		// System.out.println("local::m() " + localVar);
		// }
		// }
		//
		// Local local = new Local();
		// local.m();

		// -----------------------------------------

	}

}
