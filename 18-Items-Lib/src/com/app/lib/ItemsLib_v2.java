package com.app.lib;

import java.util.ArrayList;
import java.util.List;

import com.app.functions.Consumer;
import com.app.functions.Mapper;
import com.app.functions.Predicate;

public class ItemsLib_v2 {
	public <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> filteredList = new ArrayList<>();
		for (T t : list) {
			if (predicate.test(t)) {
				filteredList.add(t);
			}
		}
		return filteredList;
	}
	public <T, R> List<R> map(List<T> list, Mapper<T, R> mapper) {
		List<R> mappedList = new ArrayList<>();
		for (T t : list) {
			mappedList.add(mapper.map(t));
		}
		return mappedList;
	}
	public <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.apply(t);
		}
	}
}
