package com.ionixx.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private int id;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="mobile")
	private String mobile;
	@Column(name="address")
	private String address;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Customer(String customerName, String mobile, String address) {
		this.customerName = customerName;
		this.mobile = mobile;
		this.address = address;
	}
	
	public Customer() {}
	
}
