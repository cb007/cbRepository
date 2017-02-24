package com.scope.banking.utilities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.banking.entities.Flight;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml");

		Flight flight = (Flight) applicationContext.getBean(Flight.class);
		try {
			flight.setCapacity(-6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flight.getCapacity();
	}

}
