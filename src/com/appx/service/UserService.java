package com.appx.service;

import java.sql.SQLException;

import com.appx.form.UserForm;
import com.appx.repository.UserRepository;

public class UserService {

	private UserRepository userRepository = new UserRepository();
	
	public void Save(UserForm form) throws SQLException, ClassNotFoundException{	
		userRepository.AddUser(form);
	}
	
	public boolean Check(UserForm form) throws ClassNotFoundException, SQLException{		
		return userRepository.CheckUser(form.getUsername() , form.getPassword());
	}
}
