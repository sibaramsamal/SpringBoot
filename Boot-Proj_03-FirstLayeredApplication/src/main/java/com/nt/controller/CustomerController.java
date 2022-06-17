package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.beans.CustomerBean;
import com.nt.services.CustomerService;

@Controller("controller")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	public void saveData(CustomerBean bean) throws Exception{
		String status = service.saveData(bean);
		System.out.println(status);
	}
	
	public void showData() throws Exception{
		service.showData();
	}
}
