package com;

import car.Car;
import wheel.Wheel;
import wheel.ceat.CEATWheel;
import wheel.mrf.MRFWheel;

public class TestDriveApp {

	public static void main(String[] args) {

		// init...
		Wheel mrfWheel=new MRFWheel();
		Wheel ceatWheel=new CEATWheel();
		Car car = new Car(ceatWheel);

		// use..
		car.move();
		car.move();
		car.move();

		// close..

	}

}
