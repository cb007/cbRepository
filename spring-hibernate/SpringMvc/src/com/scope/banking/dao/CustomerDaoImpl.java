package com.scope.banking.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.scope.banking.entities.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	@Qualifier(value="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer details for insertion in DAO layer:"+customer);
		sessionFactory.getCurrentSession().save(customer);
		System.out.println("Customer saved into DB successfully");
	}

}
