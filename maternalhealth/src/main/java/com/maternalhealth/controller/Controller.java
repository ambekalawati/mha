package com.maternalhealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maternalhealth.service.UserService;
import com.maternalhealth.vo.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Controller {
	@Autowired
	private UserService service;

	@PostMapping(path = "/user_info/add")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		log.info("User added {}", user);
		service.addUser(user);
		return new ResponseEntity<>("User added successfully",HttpStatus.OK);

	}
	@GetMapping(path = "/password/{email}")
	public ResponseEntity<String> getUserPassword(@PathVariable String email) {
		log.info("user password {}", email);
		String userPassword = service.getUserPassword(email);
		return new ResponseEntity<>(userPassword,HttpStatus.OK);
	}
	@PostMapping(path = "/verify")
	public ResponseEntity<String> verifyUser(@RequestBody User user) {
		log.info("User data {}", user);
		String verifyUser = service.verifyUser(user.getEmail(), user.getPassword());
		return new ResponseEntity<>("User Verified",HttpStatus.OK);
	}

}
