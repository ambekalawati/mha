package com.mha.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutAction extends MhaBaseAction {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("msg", "This is all about MHA");
		return "about.html";

	}

}