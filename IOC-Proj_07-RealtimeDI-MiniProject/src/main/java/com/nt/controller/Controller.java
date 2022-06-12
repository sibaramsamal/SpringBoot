package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerService;
import com.nt.vo.CustomerVO;

public class Controller {
	private CustomerService service;

	public Controller(CustomerService service) {
		this.service = service;
	}
	public String getInterest(CustomerVO vo) throws Exception {
		CustomerDTO dto = new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCaddr(vo.getCaddr());
		dto.setAmount(Float.parseFloat(vo.getAmount()));
		dto.setDuration(Float.parseFloat(vo.getDuration()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		
		return service.getInterest(dto);
	}
}
