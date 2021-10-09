package com.krishna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.model.User;
import com.krishna.service.UserService;
import com.krishna.util.UserValidator;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	@PostMapping("")
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception {
		
	   User response = userService.createUser(user);
		
		//userDto.setMessage(message);
		return new ResponseEntity<User>(response, null, 200);
	}

}
