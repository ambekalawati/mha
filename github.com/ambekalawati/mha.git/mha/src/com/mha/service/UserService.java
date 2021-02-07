package com.mha.service;

import com.mha.model.UserModel;
import com.mha.response.Response;

public interface UserService {
	public abstract String addUser(UserModel user);

	public abstract Response verifyUser(String email, String password);

	public abstract Response getUserByMail(String email);

}
