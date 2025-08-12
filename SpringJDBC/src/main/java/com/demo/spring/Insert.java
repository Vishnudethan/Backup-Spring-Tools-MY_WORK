package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Insert {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("cfg.xml");
		UserDAO sd=(UserDAO) cpxac.getBean("userDao");
		UserModel um =new UserModel();
		um.setName("Demo123");
		um.setAge(2443);
		um.setPlace("Tvm23233");
		//sd.insertUser(um);
		sd.viewUsers();
		
	}

}
