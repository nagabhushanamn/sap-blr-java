package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MakeBigFile {

	public static void main(String[] args) throws IOException {

		// FileWriter fw = new FileWriter("big-file.txt");
		// for (int i = 0; i < 100000000; i++) {
		// fw.write(Integer.toString(i) + "\n");
		// if (i % 2 == 100)
		// fw.flush();
		// }
		// fw.close();
		// System.out.println("big file created..");

		// --------------------------------------------------

		FileReader fr = new FileReader("big-file.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

	}

}
