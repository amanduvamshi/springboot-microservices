package com.krishna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Column(name = "cart_id")
	private String cartId;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="productId")
	private String productId;

	public String getUserId() {
		return userId;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Cart [userId=" + userId + ", productId=" + productId + "]";
	}
	
	
}