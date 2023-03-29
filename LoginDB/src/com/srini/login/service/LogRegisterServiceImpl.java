package com.srini.login.service;

import com.srini.login.model.LogRegister;

public class LogRegisterServiceImpl implements LogRegisterService{

	@Override
	public boolean register(LogRegister register) {
		// TODO Auto-generated method stub
		return dao.register(register);
	}

	@Override
	public boolean login(String DeveloperId,String Password) {
		// TODO Auto-generated method stub
		return dao.login(DeveloperId, Password);
	}

}
