package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("dir/data.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("dir/new-data.txt")) {

			String line = null;
			while ((line = br.readLine()) != null) {
				fw.write(line);
				fw.flush();
			}

			// stream closed
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
