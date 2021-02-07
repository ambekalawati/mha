package com.mha.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mha.factory.UserFactory;
import com.mha.mail.service.MailService;
import com.mha.response.Response;
import com.mha.service.UserService;

public class ForgotPasswordAction extends MhaBaseAction {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserService userService = UserFactory.getServiceInstance();
		String page = null;
		Response result = userService.getUserByMail(request.getParameter("email"));
		if (result.isSuccess()) {
			request.getSession().setAttribute("msg", "<h2 style='color:white;'>Your password is send to your email. Kindly check your email/spam.</h2>");
			request.getSession().setAttribute("success", result.isSuccess());
			MailService.sendMail(request.getParameter("email"), "Your password is ", result.getData());
			page = "success.jsp";
		} else {
			request.setAttribute("msg", result.getMessage());
			request.setAttribute("success", "fail");
			page = "forgot.jsp";
		}
		return page;
	}
}
