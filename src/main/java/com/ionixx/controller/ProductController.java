package com.ionixx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ionixx.pojo.Customer;
import com.ionixx.services.CustomerService;
import com.ionixx.services.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService; 
	
	@RequestMapping(value="/buyProduct/{id}/",method=RequestMethod.GET)
	public String customerInfo(@PathVariable("id") Integer id, @ModelAttribute("addCustomer") Customer customer) {
		System.out.println("Adding Product ID :"+id + "Object :"+productService.selectProduct(id).getName());
		return "customerInfo";
	}
	
	@RequestMapping(value="/buyProduct/{id}/addCustomer",method=RequestMethod.POST)
	public String addCustomer(@PathVariable("id") Integer id, @ModelAttribute("addCustomer") Customer customer) {
		System.out.println("Customer View");
		customer.setProduct(productService.selectProduct(id));
		customerService.addCustomer(customer);
		return "redirect:/";
	}
	

}
