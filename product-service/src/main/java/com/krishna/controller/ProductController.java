package com.krishna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.model.Product;
import com.krishna.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

   @PostMapping("")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
	   Product response = productService.createProduct(product);
		return new ResponseEntity<Product>(response, HttpStatus.CREATED);
	}
   
   @GetMapping("")
   public ResponseEntity<Iterable> getAllProducts(){
	   Iterable<Product> products = productService.getAllProducts();
	   return new ResponseEntity<Iterable>(products, HttpStatus.ACCEPTED);
   }

   @GetMapping("/productType")
   public List<Product> getProductsBasedOnProductType(@RequestParam(required = false) String productType){
	 System.out.println("ProductType..."+productType);
	   return productService.getProductsBasedOnProductType(productType); 
   }
}
