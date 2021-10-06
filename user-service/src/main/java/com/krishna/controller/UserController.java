package com.krishna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.model.User;
import com.krishna.model.UserDTO;
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
	public ResponseEntity<UserDTO> createUser(@RequestBody User user) throws Exception {
		UserDTO userDto=new UserDTO();
		
		boolean isValid = userValidator.validateUser(user);
		if(!isValid) {
			throw new Exception("Password must contain 1.");
		}
			
	   String message = userService.createUser(user);
		
		userDto.setMessage(message);
		return new ResponseEntity<UserDTO>(userDto, null, 200);
	}

}
