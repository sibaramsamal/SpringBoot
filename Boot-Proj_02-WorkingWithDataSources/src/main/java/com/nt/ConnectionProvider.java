package com.nt;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("connection")
public class ConnectionProvider {
	@Autowired
	private DataSource ds;
	Connection con;
	public Connection getConnection() {
		try {
			con = ds.getConnection();
			System.out.println("Injected DataSource: "+ds.getClass());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
