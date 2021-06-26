package com.healthbooth.mapper.impl;

import org.springframework.stereotype.Component;

import com.healthbooth.entity.UserEntity;
import com.healthbooth.mapper.Mapper;
import com.healthbooth.model.UserModel;
@Component
public class MapperImpl implements Mapper{

	@Override
	public UserEntity mapToUserEntity(UserModel user) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(user.getUserName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPassword(user.getPassword());
		userEntity.setState(user.getState());
		userEntity.setCountry(user.getCountry());
		userEntity.setPincode(user.getPincode());
		return userEntity;
	}

	@Override
	public UserModel mapToUser(UserEntity user) {
		UserModel user1 = new UserModel();
		user1.setUserId(user.getUserId());
		user1.setUserName(user.getUserName());
		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());
		user1.setState(user.getState());
		user1.setCountry(user.getCountry());
		user1.setPincode(user.getPincode());
		return user1;
	}

}
