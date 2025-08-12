package com.demo.spring;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	public String insertUser(UserModel um) {
		String query="insert into db2.user_details_dao(user_name,user_age,user_place) values('"+um.getName()+"',"+um.getAge()+",'"+um.getPlace()+"');";
		int rowCount=jdbcTemplate.update(query);
		if(rowCount!=0) {
			return "success";
		}return "failed";
	}	
	
	public void viewUsers() {
		String query="select * from db2.user_details_Dao;";
		UserRowMapper urm=new UserRowMapper();
		
		jdbcTemplate.query(query, urm).forEach(u -> System.out.println(u));
	}
}
