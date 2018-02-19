package com.car;

import com.wheel.Wheel;

public class Car {

	private Wheel wheel;

	public Car(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		this.wheel.rotate();
		System.out.println("car moving..");
		this.wheel.breakBehav();
	}

}
