package com.colln.stack_queue;

import java.util.Deque;
import java.util.LinkedList;

public class Ex4 {

	public static void main(String[] args) {

		Deque<String> deque = new LinkedList<>();
		deque.addFirst("A");
		deque.addLast("B");
		deque.addLast("Z");

		System.out.println(deque.removeLast());

	}

}
