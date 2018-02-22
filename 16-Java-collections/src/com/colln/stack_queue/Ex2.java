package com.colln.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Ex2 {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.offer("B");

		// System.out.println(queue.peek());

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
