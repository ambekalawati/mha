package com.mha.service.impl;

import com.mha.constant.Message;
import com.mha.factory.UserFactory;
import com.mha.mapper.Mapper;
import com.mha.model.UserModel;
import com.mha.repository.UserRepository;
import com.mha.response.Response;
import com.mha.service.UserService;
import com.mha.util.MessageBundle;

public class UserServiceImpl implements UserService {
	private UserRepository repo;
	private Mapper map;

	public UserServiceImpl() {
		this.repo = UserFactory.getRepositoryInstance();
		this.map = UserFactory.getMapperInstance();
	}

	@Override
	public String addUser(UserModel user) {
		Response res = repo.addUser(map.mapToUserEntity(user));
		if (res.isSuccess()) {
			return MessageBundle.getMessage(Message.USER_ADDED);
		} else {
			return MessageBundle.getMessage(Message.USER_NOT_ADDED);
		}
	}

	@Override
	public Response verifyUser(String email, String password) {
		Response res = repo.verifyUser(email, password);
		return res;
	}

	@Override
	public Response getUserByMail(String email) {
		Response res = repo.getUserByMail(email);
		return res;
	}
}
