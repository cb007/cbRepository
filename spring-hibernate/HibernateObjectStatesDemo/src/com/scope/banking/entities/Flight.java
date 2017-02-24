package com.scope.banking.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "MakeMyTrip_Flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Flight_code")
	private int flightCode;
	@Column(name = "Service_Provider", nullable = false, length = 25)
	private String serviceProvider;
	@Column(name = "Capacity", nullable = false, length = 50)
	private int capacity;
	@Enumerated(EnumType.STRING)
	@Column(name = "Flight_Status")
	private FlightStatus flightStatus;
	// Which format the date to be stored -- Temporal
	@Temporal(TemporalType.DATE)
	@Column(name = "Date_Of_Purchase")
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

	public FlightStatus getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Flight [flightCode=" + flightCode + ", serviceProvider="
				+ serviceProvider + ", capacity=" + capacity
				+ ", flightStatus=" + flightStatus + ", dop=" + dop + "]";
	}

}