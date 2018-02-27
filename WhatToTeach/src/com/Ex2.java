package com;

public class Ex2 {

	public static void main(String[] args) {

		// 1.primtive to w-object
		int pri = 123;
		Integer obj1 = new Integer(pri);
		// or
		Integer ob2 = pri;

		// 2.w-object to primitive
		int n1 = obj1.intValue();
		// or
		int n2 = obj1;

		// 3. String-num to primtive : parse___()
		String sn = "123";
		int n3 = Integer.parseInt(sn);
		// 4. primitive to String
		int p = 123;
		String sn2 = String.valueOf(p);

		// 5. w-object to string
		String s = obj1.toString();

		// 6. String to w-object
		Integer obj3 = new Integer(s);

	}

}
