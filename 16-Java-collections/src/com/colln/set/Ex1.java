package com.colln.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {

		// Set<String> set = new TreeSet<>();
		// Set<String> set = new HashSet<>();
		Set<String> set = new LinkedHashSet<>();
		set.add("A");
		set.add("C");
		set.add("B");
		set.add("E");
		set.add("P");
		set.add("B");
		set.add("X");
		// boolean b = set.add("A");
		// System.out.println(b);

		System.out.println(set);

	}

}
