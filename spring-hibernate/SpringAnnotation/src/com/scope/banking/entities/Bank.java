package com.scope.banking.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;


public class Bank {

	private String id;
	private String bankName;
	@Autowired
	@Qualifier(value="customer1")
	//Without using qualifier - property and bean name should be same
	private Customer customer;
	
	@Autowired
	@Qualifier("customer2")
	//Without using qualifier - property and bean name should be same
	private Customer cust;
	
	/*@Resource
	private List<Customer> customerList;
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Customer getCust() {
		return cust;
	}
	
	@Bean
	public DataSource getInstance()
	{
		return new DataSource();
	}
	
	
	
}
