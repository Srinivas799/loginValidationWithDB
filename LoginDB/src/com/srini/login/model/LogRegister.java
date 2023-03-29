package com.srini.login.model;

public class LogRegister {
	private String Name,Email,DeveloperId,Password;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDeveloperId() {
		return DeveloperId;
	}

	public void setDeveloperId(String developerId) {
		DeveloperId = developerId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public LogRegister(String name, String email, String developerId, String password) {
		super();
		Name = name;
		Email = email;
		DeveloperId = developerId;
		Password = password;
	}
	

	public LogRegister(String developerId, String password) {
		super();
		DeveloperId = developerId;
		Password = password;
	}

	@Override
	public String toString() {
		return "LogRegister [Name=" + Name + ", Email=" + Email + ", DeveloperId=" + DeveloperId + ", Password="
				+ Password + "]";
	}
	
	
	
}
