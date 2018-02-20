package com.patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

class DoorEvent {
	private int floor;
	private int dooNum;
	public DoorEvent(int floor, int dooNum) {
		this.floor = floor;
		this.dooNum = dooNum;
	}

	public int getFloor() {
		return floor;
	}

	public int getDooNum() {
		return dooNum;
	}

}

interface DoorListener {
	void on(DoorEvent event);

	void off(DoorEvent event);
}

class Door {
	private List<DoorListener> list = new ArrayList<>(); // collection topic

	public void addDoorListener(DoorListener listener) {
		list.add(listener);
	}

	public void removeListener(DoorListener listener) {
		list.remove(listener);
	}

	public void open() {
		System.out.println("Door opened..");
		DoorEvent doorEvent = new DoorEvent(4, 101);
		for (DoorListener listener : list) {
			listener.on(doorEvent);
		}
	}

	public void close() {
		System.out.println("Door closed..");
		DoorEvent doorEvent = new DoorEvent(4, 101);
		for (DoorListener listener : list) {
			listener.off(doorEvent);
		}
	}
}

class Light implements DoorListener {

	@Override
	public void on(DoorEvent event) {
		System.out.println("Light ON in " + event.getDooNum() + " - " + event.getFloor());
	}

	@Override
	public void off(DoorEvent event) {
		System.out.println("Light OFF in " + event.getDooNum() + " - " + event.getFloor());
	}

}

class AC implements DoorListener {

	@Override
	public void on(DoorEvent event) {
		System.out.println("AC ON in " + event.getDooNum() + " - " + event.getFloor());
	}

	@Override
	public void off(DoorEvent event) {
		System.out.println("AC OFF in " + event.getDooNum() + " - " + event.getFloor());
	}

} 

public class Listener_Ex {

	public static void main(String[] args) throws InterruptedException {

		Door door = new Door();

		Light light = new Light();
		AC ac = new AC();

		door.addDoorListener(light);
		door.addDoorListener(ac);

		Thread.sleep(2000);

		door.open();

		Thread.sleep(2000);

		door.close();
		
		door.removeListener(ac);;
		
		Thread.sleep(2000);
		
		door.open();
		

	}

}
