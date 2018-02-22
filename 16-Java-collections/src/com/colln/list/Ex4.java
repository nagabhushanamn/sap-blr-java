package com.colln.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.model.Product;

public class Ex4 {

	public static void main(String[] args) {

		Product product1 = new Product(1232424, "item-1", 198000.00);
		Product product2 = new Product(4535435, "item-2", 8000.00);
		Product product3 = new Product(2424234, "item-3", 398000.00);
		Product product4 = new Product(6345345, "item-4", 78000.00);
		Product product5 = new Product(6345345, "item-4", 78000.00);

		// ------------------------------------------------------------

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);

		// ------------------------------------------------------------

		// class ProductsByPriceDec implements Comparator<Product> {
		// @Override
		// public int compare(Product o1, Product o2) {
		// if (o1.getPrice() == o2.getPrice())
		// return 0;
		// else if (o1.getPrice() > o2.getPrice())
		// return -1;
		// else
		// return 1;
		// }
		//
		// }
		// Comparator<Product> priceComparator=new ProductsByPriceDec();
		// or
		Comparator<Product> priceComparatorDec = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getPrice() == o2.getPrice())
					return 0;
				else if (o1.getPrice() > o2.getPrice())
					return -1;
				else
					return 1;
			}
		};

		// -------------------------------------------------------------

		// Collections.sort(products);
		// Collections.sort(products, new ProductsByPriceDec());
		products.sort(priceComparatorDec);
		display(products);

		// ------------------------------------------------------------
	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
