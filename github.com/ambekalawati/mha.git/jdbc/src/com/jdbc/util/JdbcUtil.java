package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	public static Connection getMySQLConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final String url = "jdbc:mysql://localhost:3306/testdb";
			con = DriverManager.getConnection(url, "root", "@mbe");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception occur while loading a driver");
		}
		return con;
	}

	public static void closeResource(Connection con,Statement st) {
		try {
			if (con != null) {
				con.close();
			}
			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {

		}
	}

}
