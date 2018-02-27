package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.model.Laptop;

public class Serialization_Ex {

	public static void main(String[] args) throws IOException {

		Laptop laptop = new Laptop(345463, "Mac pro", 19800.00);

		// serialize..
		File file = new File("laptop.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(laptop);
		// oos.flush();
		oos.close();

		System.out.println("obj serialized....");

	}

}
