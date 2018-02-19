package com;

class V {

}

class C extends V {

}

class B extends V {

}

public class ReferenceCasting_Ex {

	public static void main(String[] args) {

		// C c=new C();
		// B b=new B();

		// C c=new B(); // error
		//
		// V v = new C(); // implicit casting
		// v=new B();
		//

		V v = new B();
		if (v instanceof C) {
			C c = (C) v; // explicit casting
		}else {
			System.out.println("cannot cast..");
		}

	}

}






