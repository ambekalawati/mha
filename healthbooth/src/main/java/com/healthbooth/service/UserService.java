package com.healthbooth.service;

import com.healthbooth.model.UserModel;

public interface UserService {
	public void addUser(UserModel user);

	public UserModel verifyUser(String email, String password);

	public UserModel getUserByMail(String email);

	public String getUserPassword(String email);

}
