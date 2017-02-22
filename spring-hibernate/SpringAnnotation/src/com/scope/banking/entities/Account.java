package com.scope.banking.entities;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("accounts")
@Lazy
public class Account {

	private long accountNo;
	private String accountType;
	private long balance;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}
	
	
}
