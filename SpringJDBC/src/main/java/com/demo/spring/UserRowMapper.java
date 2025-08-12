package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class UserRowMapper implements RowMapper<UserModel> {
	
	@Override
	public UserModel mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		UserModel um= new UserModel();
		um.setId(rs.getInt(1));
		um.setName(rs.getString(2));
		um.setAge(rs.getInt(3));
		um.setPlace(rs.getString(4));
		return um;
		// or we can set them using the below way
		// return new userModel(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4))
	}

	
}
