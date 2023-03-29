package com.srini.login.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.srini.login.model.LogRegister;

public class LogRegisterDaoImpl implements LogRegisterDao{
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public boolean register(LogRegister register) {
		boolean result = false;
		try {
			String query = "insert into userdata1 values(?,?,?,?)";
			ps = con.prepareStatement(query);
			
			ps.setString(1, register.getName());
			ps.setString(2, register.getDeveloperId());
			ps.setString(3, register.getEmail());
			ps.setString(4, register.getPassword());
			
			ps.execute();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean login(String DeveloperId,String Password) {
		boolean result = false;
		try {
			String query = "select developerId,password from userdata1 where developerId = ? and password = ?";
			ps = con.prepareStatement(query);
			ps.setString(1, DeveloperId);
			ps.setString(2, Password);
			rs = ps.executeQuery();
			if(rs.next())
			{
				result = true;
				String developerId = rs.getString("developerId");
				String password = rs.getString("password");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
