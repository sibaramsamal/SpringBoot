package com.nt.dao;

import com.nt.bo.CustomerBO;

public interface CustomerDAO {
	public int saveData(CustomerBO bo)throws Exception;
}
