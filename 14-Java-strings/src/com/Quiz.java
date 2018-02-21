package com;

public class Quiz {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("A");
		StringBuffer sb2=sb1;
		sb2.append("B");
		sb1=sb2;
		StringBuffer sb3=sb2;
		sb3.append("C");
		sb3=sb1;
		
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb3);
		System.out.println(sb3==sb1);
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(sb3));
		System.out.println(sb3.equals(sb1));
		
		
	}
	
}
