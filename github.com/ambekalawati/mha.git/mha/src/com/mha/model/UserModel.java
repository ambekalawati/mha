package com.mha.model;

public class UserModel {
	private int userId;
	private String fullName;
	private String email;
	private String password;
	private String state;
	private String country;
	private Integer pincode;
	
	public UserModel() {
		
	}
	public UserModel(String fullName, String email, String password,  String state,
			String country, Integer pincode) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + "]";
	}

}
