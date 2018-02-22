package com.colln.stack_queue;

import java.util.Stack;

public class Ex {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		stack.add("A");
		stack.push("B");

		// System.out.println(stack.peek());

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
