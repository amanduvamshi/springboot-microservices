package com.krishna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.dao.CartRepository;
import com.krishna.model.Cart;

@Service
public class CartService {

	@Autowired
	CartRepository cartRepository;

	public Cart addToCart(Cart cart) {
		
		return cartRepository.save(cart);
	}

}