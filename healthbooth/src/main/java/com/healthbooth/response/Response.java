package com.healthbooth.response;

import lombok.Data;

@Data
public class Response {
	private boolean success;
	private String message;
	private String data;

}
