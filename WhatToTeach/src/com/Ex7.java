package com;

import java.util.StringTokenizer;

public class Ex7 {

	public static void main(String[] args) {

		String menu = "pani,poori,masala,vada,pav";
		// menu.split(regex)

		StringTokenizer tokenizer = new StringTokenizer(menu, ",", true);

		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}

	}

}
