package com;

class Ex {

	static final int STA = 100;
	final int INS;

	Ex(int v) {
		this.INS = v;
	}

}

public class Final_Variables_Ex {

	public static void main(String[] args) {

		final int LOC = 12;

		final int R_LOC;
		R_LOC = 12 + 13;

		Ex ex1 = new Ex(10);
		Ex ex2 = new Ex(20);

	}

}
