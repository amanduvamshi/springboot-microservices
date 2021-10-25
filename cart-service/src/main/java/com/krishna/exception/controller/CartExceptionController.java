package com.krishna.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.krishna.exceptions.CartNotFoundException;

@ControllerAdvice
public class CartExceptionController {

	 @ExceptionHandler(value = CartNotFoundException.class)
	   public ResponseEntity<Object> exception(CartNotFoundException exception) {
	      return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	   }
}
