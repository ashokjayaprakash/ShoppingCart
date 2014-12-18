package com.ionixx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ionixx.dao.ProductDAO;
import com.ionixx.pojo.Product;
@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao; 
	@Transactional
	public void addProduct(Product product) {
		
			productDao.addProduct(product);				
	}
	
	@Transactional
	public List<Product> listProducts() {
		return productDao.listProduct();
	}
	@Transactional
	public Product selectProduct(Integer id) {
		return productDao.selectProduct(id);
	}
	
}
