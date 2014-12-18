package com.ionixx.dao;

import java.util.List;

import com.ionixx.pojo.Product;

public interface ProductDAO {
	
	public void addProduct(Product product);
	public List<Product> listProduct();
	public Product selectProduct(Integer id);

}
