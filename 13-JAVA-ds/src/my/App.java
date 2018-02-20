package my;

import java.util.Iterator;

import my.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		myList.add("E");

		// Iterator<String> it = myList.iterator();
		// while (it.hasNext()) {
		// String item = it.next();
		// System.out.println(item);
		// }

		// or
		
		for (String item : myList) {
			System.out.println(item);
		}

	}

}
