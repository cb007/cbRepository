package com.scope.banking.implementations;

import com.scope.banking.interfaces.Transaction;

public class CreditCardTransaction implements Transaction {

	@Override
	public String payment(int amount) {
		// TODO Auto-generated method stub
		String status=null;
		if(amount>1000)
		{
			status="Transaction done using credit card";
		}
		else
		{
			status="No transaction using credit card";
		}
		return status;
	}

}
