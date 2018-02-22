package com.colln.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex2 {

	public static void compareList(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add("hello..");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void main(String[] args) {

		compareList(new ArrayList<>());
		compareList(new Vector<>());
		compareList(new LinkedList<>());

	}

}
