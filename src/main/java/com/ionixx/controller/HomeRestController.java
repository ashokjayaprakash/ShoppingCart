package com.ionixx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ionixx.pojo.Product;
import com.ionixx.services.ProductService;

@RestController
@RequestMapping("/api")
public class HomeRestController {
	
	@Autowired 
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET,headers="Accept=application/json")
	public List<Product> showHome(@ModelAttribute("addProduct") Product product, Map<String, Object> map) {
		return productService.listProducts();
	}
	
	@RequestMapping(value="/str",method=RequestMethod.GET,headers="Accept=application/json")
	public Map<String, Object> showHome() {
		
		Map<String, Object> l = new HashMap<String, Object>();
		l.put("name", "Ashok");
		l.put("name1", "Ashok1");
		return l;
	}
}
