package com.samples;

interface Subject {

}

class Java implements Subject {
}

class JavaScript implements Subject {
}

class CPlusPlus implements Subject {

}

class Trainer<S extends Subject> {
	S subject;

	public S getSubject() {
		return subject;
	}

	public void setSubject(S subject) {
		this.subject = subject;
	}
}

public class Ex4 {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<>();
		javaTrainer.setSubject(new Java());
		// javaTrainer.setSubject(new JavaScript());

		Trainer<JavaScript> jsTrainer = new Trainer<>();

		Trainer<CPlusPlus> cPlusPlusTrainer = new Trainer<>();

	}

}
