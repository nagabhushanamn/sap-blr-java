package com.colln;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		for (String item : list) {
			if (item.equals("C")) {
				list.remove(item);
			}
			System.out.println(item);
		}

	}

}
