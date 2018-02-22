package com.colln.stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex3 {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>();
		queue.add("C");
		queue.add("A");
		queue.add("B");

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
