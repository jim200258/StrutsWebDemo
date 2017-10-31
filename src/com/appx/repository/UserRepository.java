package com.appx.repository;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.appx.entity.UserInfoEntity;
import com.appx.form.UserForm;
import com.appx.hibernate.Utils;


public class UserRepository {

	public void AddUser(UserForm form) throws SQLException, ClassNotFoundException {

		Session session = Utils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		UserInfoEntity user = new UserInfoEntity();
		user.setName(form.getUsername());
		user.setPassword(form.getPassword());
		session.save(user);
		tx.commit();		
		session.close();
	}

	public boolean CheckUser(String name, String password) throws SQLException, ClassNotFoundException {
		
		Session session = Utils.getSessionFactory().openSession();						
		String hql = "FROM UserInfoEntity u " + " WHERE u.name = :userName and u.password = :userPassword ";
		Query query = session.createQuery(hql);
		query.setParameter("userName", name);
		query.setParameter("userPassword", password);
		List<UserInfoEntity> results = query.list();
		if( results.size() == 0 )
			return false;
		return true;
	}
}
