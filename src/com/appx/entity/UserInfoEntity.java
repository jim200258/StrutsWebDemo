package com.appx.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_INFO")
public class UserInfoEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@Column(name = "NAME")
	private String name;
	 
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "AGE")
	private String age;
	 
	@Column(name = "IMG_PATH")
	private String imgPath;
	
	public int getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
