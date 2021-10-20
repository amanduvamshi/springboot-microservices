package com.krishna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Column(name="product_id")
	@Id
	private String productId;
	
	@Column(name="product_type")
	private String productType;  
	
	@Column (name = "product_name")
	private String productName;
	
	@Column (name = "product_price")
	private double productPrice;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productType=" + productType + ", productName=" + productName
				+ ", productPrice=" + productPrice + "]";
	}

	
	

}
