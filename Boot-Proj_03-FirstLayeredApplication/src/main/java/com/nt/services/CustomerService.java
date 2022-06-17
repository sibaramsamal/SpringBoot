package com.nt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.beans.CustomerBean;
import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;

@Service("service")
public class CustomerService {
	@Autowired
	private CustomerBO bo;
	@Autowired
	private CustomerDAO dao;
	public String saveData(CustomerBean bean) throws Exception{
		String result = "";
		float interest = (bean.getAmount() * bean.getTime() * bean.getRate()) / 100;
		bo.setName(bean.getCname());
		bo.setAddress(bean.getAddress());
		bo.setAmount(bean.getAmount());
		bo.setRate(bean.getRate());
		bo.setTime(bean.getTime());
		bo.setInterest(interest);
		int i = dao.saveData(bo);
		if(i < 0)
			result += "Failed to save data !!!";
		else
			result += "Data inserted successfully...";
		return result;
	}
	public void showData()throws Exception{
		List<CustomerBean> lst = dao.getCustomerDetails();
		if(lst != null) {
			System.out.println("Name \t Address \t Amount \t Time");
			for(CustomerBean bean:lst) {
				System.out.println(bean.getCname()+"\t"+bean.getAddress()+"\t"+bean.getAmount()+"\t"+bean.getTime());
			}
		}
		else
			System.out.println("No data to display...");
	}
}
