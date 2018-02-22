package com;

class Todo {
	private int id;
	private String title;
	private boolean completed;

	public Todo(int id, String title, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Todo todo = (Todo) obj;
		if (this.title.equals(todo.title)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.title + " instance finalized...");
	}

}

public class Ex {

	public static void main(String[] args) {

		// Todo todo = new Todo(2132, "Learn java", false);
		// String todoString = todo.toString();
		// System.out.println(todoString);

		// ---------------------------------

		// Class<?> clazz=todo.getClass(); // reflection API
		// System.out.println(clazz.getName());

		// ------------------------------------
		//
		// Todo todo1 = new Todo(2132, "Learn java", false);
		// Todo todo2 = new Todo(2134, "Learn java", true);
		//
		// // System.out.println(todo1==todo2);
		// System.out.println(todo1.equals(todo2));
		// ----------------------------------------

		Todo todo1 = new Todo(2132, "Learn java", false);
		todo1 = null;
		System.gc();

		for (int i = 0; i < 100; i++) {

		}

	}

}
