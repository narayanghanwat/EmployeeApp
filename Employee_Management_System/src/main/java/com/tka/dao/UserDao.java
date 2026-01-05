package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.model.User;


@Repository
public class UserDao {
	@Autowired
	SessionFactory sf;

	public boolean verifyLoginDetails(User us) {
		Session ssn = sf.openSession();
		
		Query<User> res = ssn.createQuery("from User u where u.username = :uname and u.password = :pwd", User.class)
				.setParameter("uname", us.getUsername()).setParameter("pwd", us.getPassword());
		User u = res.uniqueResult();	
		return (u != null);
	}
	
}
