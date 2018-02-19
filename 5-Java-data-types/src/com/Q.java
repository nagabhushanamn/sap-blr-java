package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Todo {

	public final int id;
	public final String title;
	public final boolean completed;
	public final List<String> list;

	public Todo(int id, String title, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("item1");
		this.list = Collections.unmodifiableList(arrayList);
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isCompleted() {
		return completed;
	}

}

public class Q {

	public static void main(String[] args) {
		Todo todo = new Todo(4567, "shud eat", false); // immutable object
	}

}
