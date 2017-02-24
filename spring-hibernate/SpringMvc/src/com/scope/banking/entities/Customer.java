package com.scope.banking.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
@Table(name = "Customer_Registration_for_MVC")
public class Customer {

	@Id
	@NumberFormat(style = Style.NUMBER)
	@Column(name = "customer_id")
	private int customerId;

	@NotEmpty
	@Size(min = 5, max = 20, message = "Name should be between 5 to 20 characters")
	@Column(name = "customer_name")
	private String name;

	@Column(name = "customer_dob")
	private Date dob;

	@NotEmpty(message = "Address should not be empty")
	@Column(name = "customer_address")
	private String address;

	@NotEmpty(message = "phoneNo should not be empty")
	@Column(name = "customer_phone")
	private String phoneNo;

	@NotEmpty(message = "email should not be empty")
	@Column(name = "customer_email")
	private String email;

	@NotEmpty(message = "State should not be empty")
	@Column(name = "State_Code")
	private String stateCode;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name
				+ ", dob=" + dob + ", address=" + address + ", phoneNo="
				+ phoneNo + ", email=" + email + ", stateCode=" + stateCode
				+ "]";
	}

	
}