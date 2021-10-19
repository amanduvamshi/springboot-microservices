package com.krishna.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.krishna.exceptions.UserNotFoundException;

@ControllerAdvice
public class UserExceptionController {

	 @ExceptionHandler(value = UserNotFoundException.class)
	   public ResponseEntity<Object> exception(UserNotFoundException exception) {
	      return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	   }
}
