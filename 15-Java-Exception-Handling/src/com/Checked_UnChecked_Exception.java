package com;

// Team-1 Module
//---------------------------------------

class Module1 {
	public void m() throws Exception {
		System.out.println("Module-1 :: m()");
		throw new Exception(" i hate u"); // unchecked exception
	}
}

// ---------------------------------------

// Team-2 Module
// ---------------------------------------

class Module2 {
	public void m() throws Exception {
		Module1 module1 = new Module1();
		module1.m();
		System.out.println("Module-2 :: m()");
	}
}

// ---------------------------------------

public class Checked_UnChecked_Exception {

	public static void main(String[] args) {

		try {
			Module2 module2 = new Module2();
			module2.m();
		} catch (Exception e) {
			System.out.println("Im handling in main()");
			e.printStackTrace();
		}
	}

}
