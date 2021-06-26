package com.maternalhealth.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maternalhealth.entity.UserEntity;
import com.maternalhealth.repository.UserRepo;
import com.maternalhealth.service.UserService;
import com.maternalhealth.vo.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;

	@Override
	public void addUser(User user) {
		UserEntity entity = new UserEntity();
		entity.setUserName(user.getUserName());
		entity.setEmail(user.getEmail());
		entity.setPassword(user.getPassword());
		entity.setState(user.getState());
		entity.setCountry(user.getCountry());
		entity.setPincode(user.getPincode());
		repo.save(entity);
	}

	@Override
	public String getUserPassword(String email) {
		String userPassword = repo.getUserPassword(email);
//	    mailUtil
		return "Your password is: " + userPassword;
	}

	@Override
	public String verifyUser(String email, String password) {
		User user=new User();
		UserEntity entity = repo.findUserByEmailAndPassword(email, password);
		entity.setEmail(user.getEmail());
		entity.setPassword(user.getPassword());
		return "User Verified successfully" ;
	}

}
