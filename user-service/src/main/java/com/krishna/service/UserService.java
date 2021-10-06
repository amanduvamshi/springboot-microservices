package com.krishna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.dao.UserDAO;
import com.krishna.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDao;

	public String createUser(User user) {
		return userDao.createUser(user);
	}

}
