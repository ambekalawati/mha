package com.healthbooth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthbooth.entity.UserEntity;
import com.healthbooth.mailservice.MailUtil;
import com.healthbooth.mapper.Mapper;
import com.healthbooth.model.UserModel;
import com.healthbooth.repository.UserRepository;
import com.healthbooth.response.Response;
import com.healthbooth.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repo;
	@Autowired
	private Mapper mapper;
	private MailUtil mailUtil;

	public UserServiceImpl() {
	}

	@Override
	public void addUser(UserModel user) {
        UserEntity entity = mapper.mapToUserEntity(user);
		repo.save(entity);
//		mailUtil.sendEmail();
	}

	@Override
	public UserModel verifyUser(String email, String password) {
		UserEntity userEntity = repo.findUserByEmailAndPassword(email, password);
		return mapper.mapToUser(userEntity);

	}

	@Override
	public UserModel getUserByMail(String email) {
		UserEntity userEntity = repo.findUserByEmail(email);
		return mapper.mapToUser(userEntity);
	}

	@Override
	public String getUserPassword(String email) {
		String userPassword = repo.getUserPassword(email);
		return "Your password is: " + userPassword;
	}

}
