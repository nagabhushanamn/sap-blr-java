package com.samples;

import java.util.Arrays;
import java.util.List;

abstract class LT {
	public void eat() {
		System.out.println("LT-eat()");
	}

	public void sleep() {
		System.out.println("LT-sleep()");
	}

	abstract void work();
}

class Human extends LT {
	@Override
	void work() {
		System.out.println("Human work..");
	}
}
class Male extends Human{
	@Override
	void work() {
		System.out.println("Male Human work..");
	}
}
class Female extends Human{
	@Override
	void work() {
		System.out.println("FeMale Human work..");
	}
}

class Animal extends LT {
	@Override
	void work() {
		System.out.println("Animal Work");
	}
}

class God {
	public void manageLT(List<? extends LT> list) {
		for(LT lt:list) {
			lt.eat();
			lt.sleep();
			lt.work();
			System.out.println();
		}
		System.out.println();
	}
}

public class Ex11 {

	public static void main(String[] args) {
		
		God god=new God();
		
		List<Human> humans=Arrays.asList(
		new Human(),
		new Human()
		);

		List<Animal> animals=Arrays.asList(
		new Animal(),
		new Animal()
		);
		
		List<Male> males=Arrays.asList(
				new Male(),
				new Male()
		);
		
		
		god.manageLT(humans);
		god.manageLT(males);
		god.manageLT(animals);
		
		
		
		
	}

}
