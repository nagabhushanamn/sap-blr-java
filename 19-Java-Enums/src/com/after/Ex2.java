package com.after;

enum Level {

	LEVEL1(10) {
		@Override
		public void m() {
			System.out.println("this level-1 behav");
		}
	},
	LEVEL2(20) {
		public void m() {
			System.out.println("this level-2 behav");
		}
	},
	LEVEL3(30) {
		public void m() {
			System.out.println("this level-3 behav");
		}
	};
	private int value;

	private Level(int value) {
		// System.out.println("level enum instance created..");
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public abstract void m();

	public void normalM() {
		System.out.println("this level deffault behav");
	}

}

public class Ex2 {

	public static void main(String[] args) {

		System.out.println(Level.LEVEL1.ordinal());
		System.out.println(Level.LEVEL2.ordinal());
		System.out.println(Level.LEVEL3.ordinal());
		System.out.println();
		System.out.println(Level.LEVEL1.getValue());

		// -----------------------------------------
		Level level = Level.LEVEL3;
		switch (level) {
		case LEVEL1:
			System.out.println("u r in level-1");
			break;
		case LEVEL2:
			System.out.println("u r in level-3");
			break;
		default:
			System.out.println("dono where u r");
			break;
		}
		// -----------------------------------------

		for (Level l : Level.values()) {
			System.out.println(l + "--> " + l.getValue());
		}

		// --------------------------------------------
		
		Level.LEVEL1.normalM();
		Level.LEVEL1.m();
		
		//----------------------------------------------

	}

}
