package com.krishna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.exceptions.UserNotFoundException;
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

		return new ResponseEntity<User>(response, null, 200);
	}

	@PostMapping("/login")
	public ResponseEntity<String> authenticate(@RequestBody User user) throws UserNotFoundException {
		// Step 1: get user info based on userName and password
		String message = userService.authenticate(user);

		// step 2: if record exists based on userType return home page.
		return new ResponseEntity<String>(message, null, 200);
	}

}
