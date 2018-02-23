package com.app.functions;

import com.app.model.Person;

public interface Consumer {
	void apply(Person person);
}
