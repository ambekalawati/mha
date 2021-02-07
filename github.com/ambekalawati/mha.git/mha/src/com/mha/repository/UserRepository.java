package com.mha.repository;

import com.mha.entity.UserEntity;
import com.mha.response.Response;

public interface UserRepository {
	public abstract Response addUser(UserEntity user);

	public abstract Response verifyUser(String email, String password);

	public abstract Response getUserByMail(String email);

}
