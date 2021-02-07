package com.mha.entity;

public class UserEntity {
	private int userId;
	private String fullName;
	private String email;
	private String password;
	private String state;
	private String country;
	int pincode;

	public UserEntity() {

	}

	public UserEntity(String fullName, String email, String password, String confirmPassword, String state,
			String country, int pincode) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}

}
