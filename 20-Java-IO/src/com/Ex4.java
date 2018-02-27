package com;

import java.io.FileReader;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {


		try (FileReader fr = new FileReader("dir/data.txt")) { // 16-bit stream opened ( ( choose for any binary file )

			int uc = -1; // 16 bit
			while ((uc = fr.read()) != -1) {
				System.out.println((char)uc);
			}

			// stream closed
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
