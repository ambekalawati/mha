package com.mha.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mha.factory.UserFactory;
import com.mha.response.Response;
import com.mha.service.UserService;

public class LoginAction extends MhaBaseAction {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String result = null;
		UserService userService = UserFactory.getServiceInstance();
		Response res = userService.verifyUser(email, password);
		if (res.isSuccess()) {
			HttpSession session = request.getSession();
			session.setAttribute("name", res.getMessage());
			result = "home.jsp";
		} else {
			result = "signup.html";
		}

		return result;
	}

}
