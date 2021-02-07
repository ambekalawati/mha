package com.mha.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mha.constant.Message;
import com.mha.entity.UserEntity;
import com.mha.exception.DataAccessException;
import com.mha.exception.ErrorMessage;
import com.mha.repository.util.JDBCUtil;
import com.mha.response.Response;

public class JDBCTemplate {
	public Response addUser(UserEntity user) {
		try (Connection con = JDBCUtil.getConnection(); PreparedStatement ps = con.prepareStatement(Message.ADD_USER)) {
			ps.setString(1, user.getFullName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getState());
			ps.setString(5, user.getCountry());
			ps.setInt(6, user.getPincode());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			ErrorMessage error = new ErrorMessage();
			error.setMessage("error occur while adding user");
			throw new DataAccessException(error);
		}
		Response res = new Response();
		res.setSuccess(true);
		res.setMessage("Your Account is created");
		return res;
	}

	public Response verifyUser(String email, String password) {
		Response res = new Response();

		try (Connection con = JDBCUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(Message.SELECT_USER_INFO);) {
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				res.setSuccess(true);
				res.setMessage(rs.getString(2));

			} else {
				res.setSuccess(false);
				res.setMessage("Invalid username or password");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			ErrorMessage error = new ErrorMessage();
			error.setMessage("error occur while verifying user email & password");
			throw new DataAccessException(error);
		}
		return res;
	}

	public Response getUserByMail(String email) {
		Response res = new Response();
		try (Connection con = JDBCUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(Message.GET_USER_BY_MAIL);) {
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				res.setSuccess(true);
				res.setMessage(rs.getString(2));
				res.setData(rs.getString(4));
			} else {
				res.setSuccess(false);
				res.setMessage("Invalid Email");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			ErrorMessage error = new ErrorMessage();
			error.setMessage("error occur while verifying user email & password");
			throw new DataAccessException(error);
		}
		return res;

	}

}
