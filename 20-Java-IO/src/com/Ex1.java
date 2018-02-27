package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) {

		try {
			InputStream in = System.in; // creates 8-bit/byte-stream with K.B
			InputStreamReader isr = new InputStreamReader(in);
			System.out.println("Enter Name !");
			int uc = -1;
			while ((uc = isr.read()) != -1) {
				System.out.println((char) uc);
				System.out.println("----");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
