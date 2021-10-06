package com.krishna.util;


import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.krishna.model.User;

@Component
public class UserValidator {

	
	@SuppressWarnings("deprecation")
	public boolean validateUser(User user) {
		if(user.getPassword().contains("1")) {
			return true;
		}
		return false;
	}
}
