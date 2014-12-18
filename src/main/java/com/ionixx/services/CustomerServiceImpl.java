package com.ionixx.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ionixx.dao.CustomerDAO;
import com.ionixx.pojo.Customer;
@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDAO customerDao;
	
	@Transactional
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		
	}

}
