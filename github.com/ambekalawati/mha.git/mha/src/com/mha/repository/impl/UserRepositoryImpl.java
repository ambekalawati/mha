package com.mha.repository.impl;

import com.mha.entity.UserEntity;
import com.mha.factory.UserFactory;
import com.mha.repository.UserRepository;
import com.mha.response.Response;
import com.mha.template.JDBCTemplate;

public class UserRepositoryImpl implements UserRepository {
	private JDBCTemplate template;

	public UserRepositoryImpl() {
		this.template = UserFactory.getJdbcTemplateInstance();
	}

	@Override
	public Response addUser(UserEntity user) {
		return template.addUser(user);

	}

	@Override
	public Response verifyUser(String email, String password) {
		return template.verifyUser(email, password);
	}

	@Override
	public Response getUserByMail(String email) {

		return template.getUserByMail(email);
	}

}
