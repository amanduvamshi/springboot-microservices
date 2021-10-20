package com.krishna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.dao.ProductRepository;
import com.krishna.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepositroy;

	public Product createProduct(Product product) {
		return productRepositroy.save(product);
	}

	public Iterable<Product> getAllProducts() {
		
		return productRepositroy.findAll();
	}

	public List<Product> getProductsBasedOnProductType(String productType) {
		
		return productRepositroy.findByProductType(productType);
	}

}