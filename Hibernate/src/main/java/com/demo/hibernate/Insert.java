package com.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void main(String[] args) {
		
	
	Configuration cfg=new Configuration().configure("cfg.xml");
	SessionFactory sesfact=cfg.buildSessionFactory();
	Session ses=sesfact.openSession();
	Transaction tx=ses.beginTransaction();
	UserModel model=new UserModel(1,"Rahulkoi",25,"Tvm254454");
	//ses.save(model);
	ses.update(model);
	tx.commit();
}
}