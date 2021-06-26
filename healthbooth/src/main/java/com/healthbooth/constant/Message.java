package com.healthbooth.constant;

public class Message {
	public static final String ADD_USER = "insert into user_info(username,email,password,state,country,pincode) values(?,?,?,?,?,?)";
	public static final String SELECT_USER_INFO = "select * from user_info where email=? and password=?";
	public static final String INVALID_USER = "user.varify.fail";
	public static final String VALID_USER = "user.varify.success";
	public static final String USER_ADDED = "user.add.success";
	public static final String USER_NOT_ADDED = "user.add.fail";
	public static final String GET_USER_BY_MAIL="select * from user_info where email=? ";

}
