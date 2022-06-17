package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.beans.CustomerBean;
import com.nt.bo.CustomerBO;

@Repository("cdao")
public class CustomerDAO {
	@Autowired
	private DataSource ds;
	private Connection con;
	
	
	private static final String SAVE_QUERRY = "INSERT INTO CUSTOMER(NAME,ADDRESS,AMOUNT,TIME,RATE,INTEREST) VALUES(?,?,?,?,?,?)" ;
	private static final String FETCH_QUERRY = "SELECT NAME,ADDRESS,AMOUNT,TIME,INTEREST FROM CUSTOMER";
	
	public int saveData(CustomerBO bo) throws Exception{
		int count = 0;
		Connection con = ds.getConnection();
		PreparedStatement pst = con.prepareStatement(SAVE_QUERRY);
		pst.setString(1, bo.getName());
		pst.setString(2, bo.getAddress());
		pst.setFloat(3, bo.getAmount());
		pst.setFloat(4, bo.getTime());
		pst.setFloat(5, bo.getRate());
		pst.setFloat(6, bo.getInterest());
		count = pst.executeUpdate();
		return count;
	}
	public List<CustomerBean> getCustomerDetails() throws SQLException{
		List<CustomerBean> custList = new ArrayList();
		int count = 0;
		System.out.println(ds.getClass());
		Connection con = ds.getConnection();
		PreparedStatement pst = con.prepareStatement(FETCH_QUERRY);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			CustomerBean bean = new CustomerBean();
			bean.setCname(rs.getString("name"));
			bean.setAddress(rs.getString("address"));
			bean.setAmount(rs.getFloat("amount"));
			bean.setTime(rs.getFloat("time"));
			custList.add(bean);
		}
		return custList;
	}
}
