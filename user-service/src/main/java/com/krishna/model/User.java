package com.krishna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Info")
public class User {
	
	@Column
	@Id
	private String email;
	@Column
	private String password;
	@Column
	private String userType;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Email:"+email);
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	

}
