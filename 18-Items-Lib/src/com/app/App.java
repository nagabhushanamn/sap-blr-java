package com.app;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.app.functions.Consumer;
import com.app.functions.Mapper;
import com.app.functions.Predicate;
import com.app.lib.ItemsLib_v2;
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

		ItemsLib_v2 itemsLib = new ItemsLib_v2();

		List<Person> females = itemsLib.filter(people, new Predicate<Person>() {
			@Override
			public boolean test(Person person) {
				return person.getGender() == Gender.FEMALE;
			}
		});

		List<String> femaleNames = itemsLib.map(females, new Mapper<Person, String>() {
			@Override
			public String map(Person item) {
				return item.getName().toUpperCase();
			}
		});
		
		List<LocalDate> dates=itemsLib.map(females, new Mapper<Person, LocalDate>() {
			@Override
			public LocalDate map(Person item) {
				return item.getDob();
			}
		});
		
		itemsLib.forEach(femaleNames, new Consumer<String>() {
			@Override
			public void apply(String item) {
				System.out.println(item);
			}
		});

		//----------------------------------------------------------
		
		// java8  ==> lambda expressions & stream API
				
		//		people
		//		.stream()
		//		.filter(p->p.getGender()==Gender.FEMALE)
		//		.map(f->f.getName().toUpperCase())
		//		.forEach(n->{
		//			System.out.println(n);
		//		});
		
	}

}
