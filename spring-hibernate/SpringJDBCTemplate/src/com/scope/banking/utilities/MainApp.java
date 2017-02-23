package com.scope.banking.utilities;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.banking.entities.Customer;
import com.scope.banking.interfaces.CustomerDao;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml");

		CustomerDao customerDao=(CustomerDao) applicationContext.getBean("customerDaoImpl");
		System.out.println("customerDao instance created:"+customerDao);
		Customer customer=(Customer) applicationContext.getBean("customer");
		System.out.println("customer instance created:"+customer);
		customer.setCustomerId(1231085);
		customer.setName("thina");
		customer.setDob(new Date(100, 07, 07));
		customer.setAddress("SG");
		/*customerDao.addCustomer(customer);
		System.out.println("Customer details inserted successfully");*/
		System.out.println(" All Customer details fetched successfully:"+customerDao.getAllCustomer());
		System.out.println(" Single customer details fetched successfully:"+customerDao.getCustomerById(1479825));
	}

}
