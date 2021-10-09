package com.krishna.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krishna.model.User;

@Repository
public interface UserRespository extends CrudRepository<User, String> {


	User findByEmail(String email);
  
	/*
	 * User findById(String id);
	 * @Query("select * from User  where email = ? and password = ?") User
	 * findByUserNameAndPassword(@Param("email") String email, @Param("password")
	 * String password);
	 */}
