package com.krishna.dao;

import org.springframework.stereotype.Repository;

import com.krishna.model.User;

@Repository
public class UserDAO {
	
	public String createUser(User user) {
		
		System.out.println("*** UserDAO ***");
		
		return "User Registration Successfully Completed";
	}

}
