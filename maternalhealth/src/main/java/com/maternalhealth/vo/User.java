package com.maternalhealth.vo;

import lombok.Data;

@Data
public class User {
	private int userId;
	private String userName;
	private String email;
	private String password;
	private String state;
	private String country;
	private int pincode;

}
