package com.scope.banking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "`User`")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {

	@Id
	@Column(name = "Mobile_No", nullable = false)
	private long mobileNo;
	@Column(name = "Email", nullable = false)
	private String email;
	@Column(name = "Name", nullable = false)
	private String name;

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}