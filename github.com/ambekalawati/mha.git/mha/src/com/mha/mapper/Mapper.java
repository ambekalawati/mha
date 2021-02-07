package com.mha.mapper;

import com.mha.entity.UserEntity;
import com.mha.model.UserModel;

public interface Mapper {
	public abstract UserEntity mapToUserEntity(UserModel user);

	public abstract UserModel mapToUser(UserEntity user);

}
