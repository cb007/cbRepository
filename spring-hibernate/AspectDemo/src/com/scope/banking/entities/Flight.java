package com.scope.banking.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Flight {

	
	private int flightCode;
	
	private String serviceProvider;
	
	private int capacity;
	
	private Date dop;

	public int getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(int flightCode) {
		this.flightCode = flightCode;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



}
