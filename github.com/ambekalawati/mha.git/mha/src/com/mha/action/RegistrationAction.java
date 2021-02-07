package com.mha.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mha.factory.UserFactory;
import com.mha.mail.service.MailService;
import com.mha.model.UserModel;
import com.mha.service.UserService;

public class RegistrationAction extends MhaBaseAction {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String email = request.getParameter("email");
		String fullName = request.getParameter("name");
		String password = request.getParameter("password");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String pincode = request.getParameter("pincode");

		UserService userService = UserFactory.getServiceInstance();
		UserModel user = new UserModel(fullName, email, password, state, country, Integer.valueOf(pincode));
		String message = userService.addUser(user);
		request.getSession().setAttribute("name", fullName);
		MailService.sendMail(email, "Registration confirmation", message);

		return "home.jsp";
	}

}
