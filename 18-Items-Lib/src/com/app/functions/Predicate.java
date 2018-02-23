package com.app.functions;

import com.app.model.Person;

public interface Predicate {
	boolean test(Person person);
}
