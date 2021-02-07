package com.mha.factory;

import com.mha.mapper.Mapper;
import com.mha.mapper.impl.MapperImpl;
import com.mha.repository.UserRepository;
import com.mha.repository.impl.UserRepositoryImpl;
import com.mha.service.UserService;
import com.mha.service.impl.UserServiceImpl;
import com.mha.template.JDBCTemplate;

public class UserFactory {
	public static UserService getServiceInstance() {
		return new UserServiceImpl();
	}

	public static UserRepository getRepositoryInstance() {
		return new UserRepositoryImpl();
	}

	public static JDBCTemplate getJdbcTemplateInstance() {
		return new JDBCTemplate();
	}

	public static Mapper getMapperInstance() {
		return new MapperImpl();
	}

}
