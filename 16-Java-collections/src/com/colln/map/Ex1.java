package com.colln.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex1 {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>();
		map.put("123", "Java");
		map.put("789", "JS");
		map.put("456", "JEE");
		map.put("456", "Spring");

		// ----------------------------------------
		//
		// Collection<String> collection=map.values();
		// for(String item:collection) {
		// System.out.println(item);
		// }

		// -----------------------------------------

		// Set<String> keySet = map.keySet();
		// for (String key : keySet) {
		// System.out.println(key + " : " + map.get(key));
		// }

		// ------------------------------------------

	}

}
