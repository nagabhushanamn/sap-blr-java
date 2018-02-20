package my.util;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

	private Node head;
	private Node tail;

	public void add(E data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node lastNode = head;
			while (lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);
		}
	}

	public void add(int index, E data) {
		// ..
	}

	public void get(int index) {
		// ..
	}

	public void reverse() {
		// ..
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public E next() {
				return null;
			}
		};

	}

	private class Node {

		E data;
		Node next;

		public Node(E data) {
			this.data = data;
		}

		public Node(E data, LinkedList<E>.Node next) {
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
