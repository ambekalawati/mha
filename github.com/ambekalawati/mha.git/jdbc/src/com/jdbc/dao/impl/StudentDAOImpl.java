package com.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.dao.StudentDAO;
import com.jdbc.entity.StudentEntity;
import com.jdbc.util.JdbcUtil;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public List<StudentEntity> findAll() {
		List<StudentEntity>list=null;
		Connection con=JdbcUtil.getMySQLConnection();
		String sql="select * from Student";
		Statement st=null;
		try {
			st=con.createStatement();
			ResultSet executeQuery = st.executeQuery(sql);
			list=new ArrayList<>();
			while(executeQuery!= null && executeQuery.next()) {
				int sid = executeQuery.getInt(1);
				String stuName = executeQuery.getString(2);
				int phone = executeQuery.getInt(3);
				String email = executeQuery.getString(4);
				StudentEntity entity=new StudentEntity();
				entity.setStudentId(sid);
				entity.setStudentName(stuName);
				entity.setStudentPhone(phone);
				entity.setStudentEmail(email);
				list.add(entity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.closeResource(con,st);
		}
		return list;
	}

	@Override
	public StudentEntity findOneStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStudent(int studentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
