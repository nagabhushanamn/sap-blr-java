package com.colln;

import java.util.HashSet;
import java.util.Set;

class Car {
	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}

public class Ex {

	public static void main(String[] args) {

		Car car1 = new Car("bmw", "black");
		Car car2 = new Car("bmw", "black");

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

		System.out.println(car1.equals(car2));

		Set<Car> cars = new HashSet<>();
		cars.add(car1);
		cars.add(car2);

		System.out.println(cars.size());

	}

}
