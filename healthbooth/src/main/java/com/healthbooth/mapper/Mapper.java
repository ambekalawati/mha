package com.healthbooth.mapper;

import com.healthbooth.entity.UserEntity;
import com.healthbooth.model.UserModel;

public interface Mapper {
	public UserEntity mapToUserEntity(UserModel user);

	public UserModel mapToUser(UserEntity user);

}
