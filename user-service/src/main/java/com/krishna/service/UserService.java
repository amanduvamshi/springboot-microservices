package com.krishna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.dao.UserDAO;
import com.krishna.dao.UserRespository;
import com.krishna.exceptions.UserNotFoundException;
import com.krishna.model.User;

@Service
public class UserService {

	@Autowired
	private UserRespository userRepositroy;

	public User createUser(User user) {
		System.out.println("User Repo..." + userRepositroy);
		userRepositroy.save(user);
		return userRepositroy.save(user);
	}

	public String authenticate(User user) throws UserNotFoundException {
		String email = user.getEmail();
		String password = user.getPassword();
		String userType = user.getUserType();
		User userInfo = userRepositroy.findByEmailAndPassword(email, password);
		System.out.println("User Info..." + userInfo);
		if (userInfo == null) {
			throw new UserNotFoundException("invalid email or password");
		}
		if (userType == null) {
			userType = "Customer";
		}
		if (userType.equals("Admin")) {
			return "Admin Home Page.";
		}

		return "Customer Home Page";
	}

}