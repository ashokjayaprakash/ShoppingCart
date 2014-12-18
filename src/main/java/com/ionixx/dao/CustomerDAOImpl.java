package com.ionixx.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ionixx.pojo.Customer;
@Repository("CustomerDAO")
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	SessionFactory sessionFactory;

	public void addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().save(customer);
	}
}
