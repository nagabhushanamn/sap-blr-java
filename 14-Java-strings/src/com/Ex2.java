package com;

public class Ex2 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("a"); // thread-safe
		sb.append("b");
		sb.reverse();
		
		String s=sb.toString();
		System.out.println(s);
		
		StringBuilder sb2=new StringBuilder();  // not thread-safe

	}

}
