package com.pm;

import com.pm.model.Product;
import com.pm.repository.ProductRepository;

public class App {

	public static void main(String[] args) {

		ProductRepository productRepository = new ProductRepository();

		Product product1 = new Product(32312, "Laptop1", 1000.00);
		Product product2 = new Product(24234, "Laptop2", 1000.00);
		Product product3 = new Product(23434, "Laptop3", 1000.00);

		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);

		productRepository.delete(23434);
		
		productRepository.findAll().forEach(item->{
			System.out.println(item);
		});

	}

}
