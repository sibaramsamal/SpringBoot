package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class DAOImplMySql implements CustomerDAO {
	private DataSource ds;
	public DAOImplMySql(DataSource ds) {
		this.ds = ds;
	}
	private final String QUERY = "INSERT INTO CUSTOMER(NAME,ADDRESS,AMOUNT,INTEREST) VALUES(?,?,?,?)";
	
	@Override
	public int saveData(CustomerBO bo) throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement pst = con.prepareStatement(QUERY);
		pst.setString(1, bo.getCname());
		pst.setString(2, bo.getCaddr());
		pst.setFloat(3, bo.getAmount());
		pst.setFloat(4, bo.getInterest());
		int i = pst.executeUpdate();
		return i;
	}

}
