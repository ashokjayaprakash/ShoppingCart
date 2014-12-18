package com.ionixx.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ionixx.pojo.Customer;
import com.ionixx.pojo.Product;
import com.ionixx.services.CustomerService;
import com.ionixx.services.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService; 
	
	public static Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String showHome(@ModelAttribute("addProduct") Product product, Map<String, Object> map) {
		log.info("Show Index");
		map.put("products",productService.listProducts());
		return "index";
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("addProduct") Product product) {
		System.out.println("Adding Product"+product.getName());
		productService.addProduct(product);
		return "redirect:/";
	}
		
	
}
