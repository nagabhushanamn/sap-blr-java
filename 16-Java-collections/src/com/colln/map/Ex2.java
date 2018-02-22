package com.colln.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

}

class Owner {
	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}

public class Ex2 {

	public static void main(String[] args) {

		Car car1 = new Car("bmw", "black");
		Car car2 = new Car("audi", "white");

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Ria");

		Map<Owner, Car> map = new HashMap<>();
		map.put(owner1, car2);
		map.put(owner2, car1);
		
		//--------------------------------------------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Owner name ?");
		String name=sc.nextLine();
		
		Owner key=new Owner(name);
		
		Car car=map.get(key);
		if(car!=null) {
			System.out.println(car);
		}else {
			System.out.println("dream it");
		}
		
		
		sc.close();
		
		

	}

}








