package com.maternalhealth.service;

import com.maternalhealth.vo.User;

public interface UserService {
	public void addUser(User user);

	public String getUserPassword(String email);

	public String verifyUser(String email, String password);

}
