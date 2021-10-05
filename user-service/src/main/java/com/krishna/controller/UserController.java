package com.krishna.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.model.User;
import com.krishna.model.UserDTO;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("")
	public ResponseEntity<UserDTO> createUser(@RequestBody User user) {
		System.out.println("User..."+user);
		UserDTO userDto=new UserDTO();
		userDto.setMessage("User Registration Successfully Completed");
		return new ResponseEntity<UserDTO>(userDto, null, 200);
	}

}
