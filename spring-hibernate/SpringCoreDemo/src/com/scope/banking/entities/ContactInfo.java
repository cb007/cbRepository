package com.scope.banking.entities;

public class ContactInfo {

	private String mobile;
	private String landline;
	private String email;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return String.format("ContactInfo [mobile=%s, landline=%s, email=%s]",
				mobile, landline, email);
	}
	
	
}
