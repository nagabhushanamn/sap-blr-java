package com.app.functions;

import com.app.model.Person;

public interface Predicate<T> {
	boolean test(T item);
}
