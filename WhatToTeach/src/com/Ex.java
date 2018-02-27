package com;

import java.util.ArrayList;
import java.util.List;

// Wrapper class
//-----------------

/*
 * 
 *  Number ( abstract class )
 *  
 *  		-Byte
 *  		-Short
 *  		-Integer
 *  		-Long
 *  
 *      -Float
 *      -Double
 *      
 *      - Boolean
 *      
 *      - Character
 * 
 * 
 * 
 */

public class Ex {

	public static void main(String[] args) {

		int pri = 123;
		Integer integer = new Integer(pri); // wrapper
		// JDK 1.5
		Integer integer2 = pri; // Auto Boxing

		// how to convert wrapper-obj to primtives?

		Integer i = 10;
		Integer j = 20;
		int arith = i.intValue() + j.intValue();
		System.out.println(arith);
		// JDK 1.5
		int arith2 = i + j;

		List<Integer> integers = new ArrayList<>();
		integers.add(new Integer(1));
		integers.add(2);

		int kk = integers.get(1);

	}

}
