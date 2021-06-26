package com.healthbooth.model;

import lombok.Data;

@Data
public class UserModel {
	private int userId;
	private String userName;
	private String email;
	private String password;
	private String state;
	private String country;
	private int pincode;

}
