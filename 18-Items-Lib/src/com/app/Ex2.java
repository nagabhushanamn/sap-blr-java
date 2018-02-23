package com.app;

interface Joiner {
	String join(String s1, String s2);
}

interface StringToIntMapper {
	int map(String s);
}

public class Ex2 {

	public static String testJoin(Joiner joiner) {
		String s1 = "hello";
		String s2 = "world";
		return joiner.join(s1, s2);
	}

	public static void main(String[] args) {

		String s = testJoin(new Joiner() {
			@Override
			public String join(String s1, String s2) {
				return s1 + " " + s2;
			}
		});

		// --------------------------------------------
		
		StringToIntMapper mapper=new StringToIntMapper() {
			@Override
			public int map(String s) {
				return s.length();
			}
		};
		
		System.out.println(mapper.map("sapient"));


	}

}
