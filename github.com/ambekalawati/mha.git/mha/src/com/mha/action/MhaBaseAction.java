package com.mha.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class MhaBaseAction {
	public abstract String process(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
