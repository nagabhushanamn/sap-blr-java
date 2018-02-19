package com;

class Xyz {

	static int staVar = 100;

	int insVar = 200;

	static void staMethod(Xyz xyz) {
		System.out.println(staVar);
		System.out.println(xyz.insVar);
	}

	void insMethod() {
		System.out.println(staVar);
		System.out.println(insVar);
	}
}

public class Var_Use_In_Methods_Ex {

	public static void main(String[] args) {

		Xyz xyz = new Xyz();
		xyz.insMethod();

		System.out.println();

		Xyz.staMethod(xyz);
	}

}
