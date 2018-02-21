package com;

public class Ex1 {

	public static void main(String[] args) {

		// String s1="sapient";
		// String s2="sapient";
		//
		// System.out.println(s1==s2);
		//
		// String s3=new String("sapient");
		// String s4=new String("sapient");
		//
		// System.out.println(s3==s4);

		// ------------------------------------------

		// String comp = "sapient";
		// String compWithLoc = comp.concat("-bengalore");
		// System.out.println(comp);
		// System.out.println(compWithLoc);

		// ---------------------------------------------
		//
		// // ---------------------------------------------
		// // module-1
		// String s1 = "hello";
		// String s11=s1.concat("-world");
		// // ---------------------------------------------
		//
		// // ---------------------------------------------
		// // module-2
		// String s2 = "hello";
		// // ---------------------------------------------

		// -----------------------------------------------------------

		// string obj's methods

		// String str = "abcda";
		// System.out.println(str.length());
		// System.out.println(str.charAt(0));
		// System.out.println(str.charAt(4));
		// System.out.println(str.indexOf('a'));
		// System.out.println(str.lastIndexOf('a'));
		// System.out.println(str.indexOf('z'));
		// System.out.println(str.indexOf("dc"));
		// System.out.println(str.startsWith("ab"));
		// System.out.println(str.endsWith("da"));
		// System.out.println(str.contains("bc"));
		// String s1=str.substring(2,4);
		// System.out.println(s1);
		// String u=str.toUpperCase();
		// System.out.println(u);

		// how to compare strings?

		// String s1="Abc";
		// String s2="abc";

		// System.out.println(s1.equals(s2));
		// System.out.println(s1.equalsIgnoreCase(s2));

		// System.out.println(s1.compareTo(s2));

		// String str = "abcda";
		// String newStr=str.replace('a', 'A');
		// System.out.println(newStr);

		// char[] ca = str.toCharArray();
		// for(char c:ca) {
		// System.out.println(c);
		// }

		// String s = " abc ";
		// String newS=s.trim();
		// System.out.println(s);
		// System.out.println(newS);

		// String s="";
		// System.out.println(s.isEmpty());

		// String str = "1234567890";
		// boolean b=str.matches("\\d{10}");
		// System.out.println(b);

		// -------------------------------------------------------

		// int i=123;
		// String s=String.valueOf(i); // primitive to string
		// i=Integer.parseInt(s); // string to int-primitive
		//
		// String st="123";
		// i=Integer.parseInt(st);

		// ------------------------------------------------------

		// String formattedString = String.format("this is %d", 12);
		// System.out.println(formattedString);
		
		//---------------------------------------------------
		
		String menu="idly,vada,poori";
		String[] menuItems=menu.split("[,]");
		for(String item:menuItems) {
			System.out.println(item);
		}

	}

}
