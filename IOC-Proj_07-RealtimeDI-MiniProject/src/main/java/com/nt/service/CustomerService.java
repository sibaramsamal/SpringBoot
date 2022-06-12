package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerService {
	private CustomerDAO dao;

	public CustomerService(CustomerDAO dao) {
		this.dao = dao;
	}
	public String getInterest(CustomerDTO dto) throws Exception{
		float interest = (dto.getAmount() * dto.getDuration() * dto.getRate()) / 100;
		CustomerBO bo =new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCaddr(dto.getCaddr());
		bo.setAmount(dto.getAmount());
		bo.setInterest(interest);
		int i = dao.saveData(bo);
		
		if(i < 0)
			return "Failed to store data. Interest calculated: "+interest;
		else
			return "Data saved successfully. Interest calculated: "+interest;
	}
}
