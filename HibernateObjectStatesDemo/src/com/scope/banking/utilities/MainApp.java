package com.scope.banking.utilities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.scope.banking.entities.Order;
import com.scope.banking.entities.Product;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Read the cfg file
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		// Creates session for the informations read from cfg file
		Session session = sessionFactory.openSession();
		// Begin transaction
		session.beginTransaction();
		/*
		 * Flight flight= new Flight(); flight.setServiceProvider("Indigo");
		 * flight.setCapacity(200); flight.setDop(new Date(110, 07, 11));
		 * flight.setFlightStatus(FlightStatus.Active);
		 */
		Order order = new Order();
		order.setOrderDate(new Date(87, 10, 10));
		order.setOrderBy("Customer");
		List<Product> productList = new ArrayList<Product>();
		Product product = new Product();
		product.setProductName("CASA");
		product.setRate(10000);
		product.setDop(new Date(97, 7, 8));
		product.setOrder(order);
		productList.add(product);
		product = new Product();
		product.setProductName("CC");
		product.setRate(20000);
		product.setDop(new Date(96, 6, 9));
		product.setOrder(order);
		productList.add(product);

		order.setProductList(productList);
		try {
			session.save(order);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

}
