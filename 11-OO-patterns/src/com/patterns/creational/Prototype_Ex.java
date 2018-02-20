package com.patterns.creational;

//Dynamic loading is a typical object-oriented feature and prototype example. For example, overriding method is a kind of prototype pattern.
//--------------------------------------------------------------

interface Shape {
	void draw();
}

class Painting {
	public void paint(Shape shape) {
		shape.draw(); // dynamic/runtime poly
	}
}

class Line implements Shape {
	@Override
	public void draw() {
		System.out.println("Painting/drawing line ");
	}
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Painting/drawing circle ");
	}
}

// --------------------------------------------------------------

class Actor {
	public void act() {
		System.out.println("i am zero..");
	}

	public void act(double pay) {
		System.out.println("i am hero..");
	}

	public void act(double pay, double pay2) {
		System.out.println("i am hero..+ villain act");
	}
}

// --------------------------------------------------------------

class Big implements Cloneable {

	private String bigProp1;
	private String bigProp2;

	public Big(String bigProp1) {
		this.bigProp1 = bigProp1;
		System.out.println("Big :: constructor..");
	}

	public String getBigProp1() {
		return bigProp1;
	}

	public void setBigProp1(String bigProp1) {
		this.bigProp1 = bigProp1;
	}

	public String getBigProp2() {
		return bigProp2;
	}

	public void setBigProp2(String bigProp2) {
		this.bigProp2 = bigProp2;
	}

	@Override
	protected Big clone() throws CloneNotSupportedException {
		return (Big) super.clone();
	}

}

public class Prototype_Ex {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Shape line = new Line();
		// Shape circle = new Circle();
		//
		// Painting painting = new Painting();
		// painting.paint(line);
		// painting.paint(circle);

		// ------------------------------------------------------

		// Actor actor = new Actor();
		// actor.act();
		// actor.act(1000.00);
		// actor.act(1000.00, 1000.00);
		//
		// System.out.println(1);
		// System.out.println(12.12);
		// System.out.println("string");

		// ------------------------------------------------------

		Big big1 = new Big("12345");

		Big big2 = big1.clone();
		System.out.println(big2.getBigProp1());
		System.out.println(big2.getBigProp2());

		System.out.println(big1 == big2);

		big2.setBigProp2("2233");

		System.out.println(big2.getBigProp2());

		// ---------------------------------------------------------

	}

}
