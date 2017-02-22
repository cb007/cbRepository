package com.scope.banking.utility;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.scope.banking.entities.Bank;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource = new ClassPathResource("spring-bean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Bank bank = (Bank) beanFactory.getBean("bank");
		System.out.println("Bank details:" + bank);

	}

}
