package com.scope.banking.entities;

import java.util.List;

public class Bank {

	private String id;
	private String bankName;
	private List<Customer> customerList;
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
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	@Override
	public String toString() {
		return String.format("Bank [id=%s, bankName=%s, customerList=%s]", id,
				bankName, customerList);
	}

	
}
