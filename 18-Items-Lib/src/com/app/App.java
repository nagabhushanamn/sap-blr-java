package com.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.app.functions.Consumer;
import com.app.functions.Mapper;
import com.app.functions.Predicate;
import com.app.lib.ItemsLib;
import com.app.model.Gender;
import com.app.model.Person;
import com.app.model.Product;
import com.app.model.ProductType;

public class App {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Nag", "naga@gmail.com", Gender.MALE, LocalDate.of(1983, 10, 05)),
				new Person("Indu", "indu@gmail.com", Gender.FEMALE, LocalDate.of(1988, 01, 16)),
				new Person("Ria", "ria@gmail.com", Gender.FEMALE, LocalDate.of(2015, 05, 30)));

		List<Product> products = Arrays.asList(new Product("Laptop", 19800.00, LocalDate.now(), ProductType.ELEC),
				new Product("product1", 1800.00, LocalDate.now(), ProductType.OTHER),
				new Product("Mobile", 19800.00, LocalDate.now(), ProductType.ELEC));

		// ---------------------------------------------------------------------

		ItemsLib itemsLib = new ItemsLib();

		List<Person> output = itemsLib.filter(people, new Predicate() {
			@Override
			public boolean test(Person person) {
				return person.getGender() == Gender.FEMALE;
			}
		});
		itemsLib.forEach(output, new Consumer() {
			@Override
			public void apply(Person person) {
				System.out.println(person.getName() + " - " + person.getDob());
			}
		});

		List<String> allEmails = itemsLib.map(people, new Mapper() {
			@Override
			public String map(Person person) {
				return person.getEmail();
			}
		});

	}

}
