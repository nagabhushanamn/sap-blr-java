package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.model.Laptop;

public class Serialization_Ex2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("laptop.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Laptop laptop = (Laptop) obj;
		ois.close();

		System.out.println(laptop);
	}

}
