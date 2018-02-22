package com.colln.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.model.Product;

public class Ex2 {

	public static void main(String[] args) {

		Product product1 = new Product(1232424, "item-1", 198000.00);
		Product product2 = new Product(4535435, "item-2", 8000.00);
		Product product3 = new Product(2424234, "item-3", 398000.00);
		Product product4 = new Product(6345345, "item-4", 78000.00);
		Product product5 = new Product(6345345, "item-4", 78000.00);
		// ------------------------------------------------------------
		// Set<Product> products = new TreeSet<>(new Comparator<Product>() {
		// @Override
		// public int compare(Product o1, Product o2) {
		// if(o1.getPrice()==o2.getPrice())return 0;
		// else if(o1.getPrice()>o2.getPrice())return -1;
		// else return 1;
		// }
		// });

		// Set<Product> products=new HashSet<>();
		Set<Product> products = new LinkedHashSet<>();

		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		// ------------------------------------------------------------
		display(products);
		// ------------------------------------------------------------
	}

	private static void display(Set<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
