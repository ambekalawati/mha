package com.healthbooth.util;

import java.util.ResourceBundle;

public class MessageBundle {
	public static String getMessage(String key) {
		ResourceBundle rb = ResourceBundle.getBundle("message");
		return rb.getString(key);
	}

}
