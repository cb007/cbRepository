package com.scope.banking.entities;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private int customerId;
	private String name;

	private Address perm;

	private Address res;

	private ContactInfo contactInfo;
	private Date dob;
	
	private Account account;

	@Autowired
	Customer(int customerId, String name, Address perm, Address res,
			ContactInfo contactInfo, Date dob, Account account) {
		this.customerId = customerId;
		this.name = name;
		this.perm = perm;
		this.res = res;
		this.contactInfo = contactInfo;
		this.dob = dob;
		this.account=account;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public Address getPerm() {
		return perm;
	}

	public Address getRes() {
		return res;
	}

	public Account getAccount() {
		return account;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerId=");
		builder.append(customerId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", perm=");
		builder.append(perm);
		builder.append(", res=");
		builder.append(res);
		builder.append(", contactInfo=");
		builder.append(contactInfo);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", account=");
		builder.append(account);
		builder.append("]");
		return builder.toString();
	}

	

}
