package com.scope.banking.entities;

public class Address {

	private String street;
	private String city;
	private String state;
	private String pincode;
	
	Address(String street, String city, String state, String pincode)
	{
		this.street=street;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPincode() {
		return pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	
	
}
