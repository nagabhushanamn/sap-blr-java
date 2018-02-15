package car;

import wheel.Wheel;

public class Car {

	private Wheel wheel;

	public Car(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car moving.....");
	}

}
