package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

interface Adder {
	int add(int n1, int n2);
}

class ArithUtil {
	public static int testAdd(int n1, int n2, Adder adder) {
		if (adder != null) {
			int r = adder.add(n1, n2);
			return r;
		} else {
			return n1 + n2;
		}
	}
}

public class Ex1 {

	public static void main(String[] args) {

		int result = ArithUtil.testAdd(12, 13, new Adder() {
			@Override
			public int add(int n1, int n2) {
				return n1 + 100 + n2 + 100;
			}
		});
		System.out.println(result);
		
		//-------------------------------------
		
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("E");
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			String next=iterator.next();
			if(next.equals("A")) {
				iterator.remove();
			}
		}
		
		// or
		
		list.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.equals("A");
			}
		});
		
		List<Integer> integers=new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t.intValue()%2==0;
			}
		});
		System.out.println(integers);
		
		
		
		

	}

}
