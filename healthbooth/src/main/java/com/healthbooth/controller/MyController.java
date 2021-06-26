package com.healthbooth.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthbooth.model.UserModel;
import com.healthbooth.service.UserService;

import lombok.extern.slf4j.Slf4j;
/**
 * 1. Rename Controller name
 * 2. Remove unused object/reference/imports
 * 3. Every method return type should be ResponseEntity.
 * 
 * @author kalaw
 *
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class MyController {
	@Autowired
	private UserService service;
	@PostMapping(path = "/addUser")
	public String addUser(@Valid @RequestBody UserModel user) {
		log.info("User data {}", user);
		service.addUser(user);
		return "user added";
	}

	@PostMapping(path = "/verify")
	public String verifyUser(@RequestBody UserModel user) {
		log.info("User data {}", user);
		UserModel verifyUser = service.verifyUser(user.getEmail(), user.getPassword());
		return "Valid user";
	}

	@GetMapping(path = "/{email}")
	public ResponseEntity<UserModel> getUserByEmail(@PathVariable String email) {
		log.info("User data {}", email);
		UserModel user = service.getUserByMail(email);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping(path = "/password/{email}")
	public ResponseEntity<String> getUserPassword(@PathVariable String email) {
		log.info("user password {}", email);
		String userPassword = service.getUserPassword(email);
		return new ResponseEntity<>(userPassword,HttpStatus.OK);
	}

}
