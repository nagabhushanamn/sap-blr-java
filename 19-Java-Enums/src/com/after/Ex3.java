package com.after;

interface Dir {
	void move();
}

class Abc {

}

enum Directions implements Dir {
	NORTH(10) {
		@Override
		public void move() {
			System.out.println("go towards delhi..");
		}

		@Override
		public String toString() {
			return "NORTH";
		}
	};

	private int value; // instance-var

	private Directions(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}

public class Ex3 {

	public static void main(String[] args) {

	}

}
