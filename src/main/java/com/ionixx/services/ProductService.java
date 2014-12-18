package com.ionixx.services;

import java.util.List;

import com.ionixx.pojo.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	public List<Product> listProducts();
	public Product selectProduct(Integer id);
}
