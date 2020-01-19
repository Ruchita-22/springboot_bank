package com.ibm.bank.controller;

import java.math.BigDecimal;

public class AccountFormBean {
	
	private String accountNumber;
	private String accountHolderName;
	private Double accountBalance;
	
	public AccountFormBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountFormBean(String accountNumber, String accountHolderName, Double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
