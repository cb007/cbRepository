package com.scope.banking.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AddressProof {

	private String type;
	private int number;
	public AddressProof(String type, int number) {
		
		this.type = type;
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public int getNumber() {
		return number;
	}
	
	
}
