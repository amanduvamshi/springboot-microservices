package com.krishna.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krishna.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

	List<Product> findByProductType(String productType);


}
