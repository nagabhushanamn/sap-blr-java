package com.app.lib;

import java.util.ArrayList;
import java.util.List;

import com.app.functions.Consumer;
import com.app.functions.Mapper;
import com.app.functions.Predicate;
import com.app.model.Person;

public class ItemsLib {

	/*
	 * - filter(inputList,condition) : outputList 
	 * - map (inputList,mapper ) :outputList 
	 * - forEach(inputList, consumer) : void
	 * 
	 */

	public List<Person> filter(List<Person> list, Predicate predicate) {
		List<Person> newList = new ArrayList<>();
		for (Person person : list) {
			if (predicate.test(person)) {
				newList.add(person);
			}
		}
		return newList;
	}

	public List<String> map(List<Person> list, Mapper mapper) {
		List<String> newList = new ArrayList<>();
		for (Person person : list) {
			newList.add(mapper.map(person));
		}
		return newList;
	}

	public void forEach(List<Person> list, Consumer consumer) {
		for (Person person : list) {
			consumer.apply(person);
		}
	}

}
