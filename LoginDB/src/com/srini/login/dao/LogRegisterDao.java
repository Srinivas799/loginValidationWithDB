package com.srini.login.dao;

import java.sql.Connection;

import com.srini.login.DBConfig.LDBConfig;
import com.srini.login.model.LogRegister;

public interface LogRegisterDao {
	LDBConfig config = new LDBConfig();
	Connection con = config.getConnection();
	boolean register(LogRegister register);
	boolean login(String DeveloperId,String Password);
}
