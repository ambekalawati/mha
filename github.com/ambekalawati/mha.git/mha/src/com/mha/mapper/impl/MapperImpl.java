package com.mha.mapper.impl;

import com.mha.entity.UserEntity;
import com.mha.mapper.Mapper;
import com.mha.model.UserModel;

public class MapperImpl implements Mapper {

	@Override
	public UserEntity mapToUserEntity(UserModel user) {
		UserEntity user1 = new UserEntity();
		user1.setFullName(user.getFullName());
		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());
		user1.setState(user.getState());
		user1.setCountry(user.getCountry());
		user1.setPincode(user.getPincode());
		return user1;
	}

	@Override
	public UserModel mapToUser(UserEntity user) {
		UserModel user1 = new UserModel();
		user1.setUserId(user.getUserId());
		user1.setFullName(user.getFullName());
		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());
		user1.setState(user.getState());
		user1.setCountry(user.getCountry());
		user1.setPincode(user.getPincode());
		return user1;
	}

}
