package com;

import com.car.Car;
import com.wheel.MRFCarWheel;
import com.wheel.Wheel;

public class TestDriveApp {

	public static void main(String[] args) {

		Wheel wheel = new MRFCarWheel();
		Car car = new Car(wheel);

		car.move();

	}

}
