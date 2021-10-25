package com.krishna.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krishna.model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, String> {

	


}
