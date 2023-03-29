package com.srini.login.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LDBConfig {
	private Connection con;
	public Connection getConnection() {
		String url = "jdbc:mysql://@127.0.0.1:3306/batchproject";
		String user = "root";
		String password = "srinu";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			System.err.println("Database connected successfully....");
			
			String query = "create table userdata1(name varchar(40),developerId varchar(40),email varchar(50),password varchar(20))";
			
			Statement st =con.createStatement();
			st.execute(query);
			System.out.println("Table has been created successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
