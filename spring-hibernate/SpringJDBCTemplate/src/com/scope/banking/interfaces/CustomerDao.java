package com.scope.banking.interfaces;

import java.util.List;

import com.scope.banking.entities.Customer;

public interface CustomerDao {

	void addCustomer(Customer customer);
	List<Customer> getAllCustomer();
	Customer getCustomerById(int id);
	void update(Customer customer);
	void insertBatch(List<Customer> customer);
	void deleteCustomer(int id);
}
