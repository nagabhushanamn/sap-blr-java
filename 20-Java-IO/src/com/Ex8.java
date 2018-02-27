package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A {

}

interface I extends Serializable {
}

class B implements I {

}

public class Ex8 {

	public static void main(String[] args) throws IOException {

		B b = new B();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dummy.ser"));
		oos.writeObject(b);
		oos.close();
		System.out.println("done..");

	}

}
