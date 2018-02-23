package com.samples;

import java.util.HashMap;

interface Map<K, V> {
	void put(K k, V v);

	V get(K k);
}

class MyMap<K, V> implements Map<K, V> {

	public void put(K k, V v) {
	}

	public V get(K k) {
		return null;
	}

}

public class Ex3 {

	public static void main(String[] args) {

		Map<String, Integer> myMap1 = new MyMap<>();
		myMap1.put("str", 123);
		Map<Integer, String> myMap2 = new MyMap<>();
		myMap2.put(123, "str");

		java.util.Map<String, Integer> map = new HashMap<>();

	}

}
