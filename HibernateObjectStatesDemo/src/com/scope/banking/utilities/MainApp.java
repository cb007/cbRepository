package com.scope.banking.utilities;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.scope.banking.entities.Flight;
import com.scope.banking.entities.FlightStatus;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Read the cfg file 
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		//Creates session for the informations read from cfg file
		Session session=sessionFactory.openSession();
		//Begin transaction
		session.beginTransaction();
		Flight flight= new Flight();
		flight.setServiceProvider("Indigo");
		flight.setCapacity(200);
		flight.setDop(new Date(110, 07, 11));
		flight.setFlightStatus(FlightStatus.Active);
		try {
			session.save(flight);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

}
