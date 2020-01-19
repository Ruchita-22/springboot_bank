package com.ibm.bank.model.persistence.exception;

public class AccountNotFoundException extends Exception{
	
	public AccountNotFoundException() {
		super();

	}

	public AccountNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

}
