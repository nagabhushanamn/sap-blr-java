package com;

import java.io.FileWriter;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("new-menu.txt");
		writer.write("biryani\n");
		writer.flush();
		writer.write("egg biryani\n");
		writer.write("chkn biryani\n");
		writer.close(); // flush + close the stream
		// writer.write("new item\n");

		System.out.println("file write finished...");

	}

}
