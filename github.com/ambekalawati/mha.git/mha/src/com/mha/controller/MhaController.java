package com.mha.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mha.action.AboutAction;
import com.mha.action.ContactAction;
import com.mha.action.DoctorAction;
import com.mha.action.ForgotPasswordAction;
import com.mha.action.LoginAction;
import com.mha.action.LogoutAction;
import com.mha.action.MhaBaseAction;
import com.mha.action.RegistrationAction;

/**
 * Servlet implementation class MhaController
 */
@WebServlet("*.do")
public class MhaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginAction loginAction = null;
	private RegistrationAction regAction = null;
	private ForgotPasswordAction passwordAction = null;
	private LogoutAction logoutAction = null;
	private AboutAction aboutAction = null;
	private ContactAction contactAction = null;
	private DoctorAction doctorAction = null;
	private MhaBaseAction action = null;

	public void init(ServletConfig config) {
		this.loginAction = new LoginAction();
		this.regAction = new RegistrationAction();
		this.passwordAction = new ForgotPasswordAction();
		this.logoutAction = new LogoutAction();
		this.aboutAction=new AboutAction();
		this.contactAction=new ContactAction();
		this.doctorAction=new DoctorAction();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MhaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("*******************");
		String uri = request.getRequestURI();
		if (uri.endsWith("forgot.do")) {
			action = passwordAction;

		} else if (uri.endsWith("registration.do")) {
			action = regAction;
		} else if (uri.endsWith("login.do")) {
			action = loginAction;
		} else if (uri.endsWith("logout.do")) {
			action = logoutAction;
		} else if (uri.endsWith("doctors.do")) {
			action = doctorAction;
		} else if (uri.endsWith("contact.do")) {
			action = contactAction;
		} else if (uri.endsWith("about.do")) {
			action = aboutAction;
		}

		else {
			action = loginAction;
		}
		String result = null;
		try {
			result = action.process(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		result=PATH+result;
		System.out.println(result);
		RequestDispatcher rd = request.getRequestDispatcher(result);
		rd.forward(request, response);
	}
	
	
	
	
	
}
