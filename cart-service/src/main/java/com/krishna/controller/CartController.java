package com.krishna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.model.Cart;
import com.krishna.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;

	@PostMapping("/")
	public Cart addToCart(@RequestParam String productId, @RequestParam String userId) {
		
		Cart cart =new Cart();
		cart.setUserId(userId);
		cart.setProductId(productId);
		return cartService.addToCart(cart);
	}
	
	
	public void getCartDetailsBasedOnUserId(@RequestParam String userId) {
		
	}
  
}
