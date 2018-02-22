package com.pm.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.pm.model.Product;

public class ProductRepository {
	private List<Product> products = new ArrayList<>();

	public void save(Product product) {
		products.add(product);
	}

	public Product get(int id) {
		Product product = null;
		for (Product p : products) {
			if (product.getId() == id) {
				product = p;
			}
		}
		return product;
	}

	public void update(int id, double newPrice) {
		for (Product p : products) {
			if (p.getId() == id) {
				p.setPrice(newPrice);
			}
		}
	}

	public void delete(int id) {

		// for (Product p : products) {
		// if (p.getId() == id) {
		// products.remove(p);
		// }
		// }

		// Iterator<Product> iterator = products.iterator();
		// while (iterator.hasNext()) {
		// Product product = (Product) iterator.next();
		// if (product.getId() == id) {
		// iterator.remove();
		// }
		//
		// }
		
		products.removeIf(item->item.getId()==id);

	}

	public List<Product> findAll() {
		return products;
	}

	public List<Product> sortBy(String propName) {
		Comparator<Product> nameComparator = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		if (propName.equals("name")) {
			products.sort(nameComparator);
		}
		return products;
	}
}
