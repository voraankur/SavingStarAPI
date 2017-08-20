package com.savingstar.application.model;

public class User {
	
	private String userid;
	private String email_address;
	private String password;
	
	public User() {
		
	}
	
	public User(String userid, String email_address, String password) {
		super();
		this.userid = userid;
		this.email_address = email_address;
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
