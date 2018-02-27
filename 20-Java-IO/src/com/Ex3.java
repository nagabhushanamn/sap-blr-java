package com;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("dir/data.txt");) { // 8-bit stream  ( choose for any binary file )

			int uc = -1;
			while ((uc = fis.read()) != -1) {
				System.out.println(uc);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
