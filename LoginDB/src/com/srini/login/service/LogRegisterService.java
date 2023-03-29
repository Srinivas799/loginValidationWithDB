package com.srini.login.service;

import com.srini.login.dao.LogRegisterDao;
import com.srini.login.dao.LogRegisterDaoImpl;
import com.srini.login.model.LogRegister;

public interface LogRegisterService {
	LogRegisterDao dao = new LogRegisterDaoImpl();
	
	boolean register(LogRegister register);
	boolean login(String DeveloperId,String Password);
}
