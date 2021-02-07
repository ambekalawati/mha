package com.mha.repository.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mha.constant.DBInfo;

public class JDBCUtil {
	public static Connection getConnection() {
		ResourceBundle rb=ResourceBundle.getBundle(DBInfo.DB_FILE_NAME);
		Connection con = null;
		try {
			Class.forName(rb.getString(DBInfo.DRIVER));
			con = DriverManager.getConnection(rb.getString(DBInfo.URL),rb.getString(DBInfo.USERNAME),rb.getString(DBInfo.PASSWORD));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
