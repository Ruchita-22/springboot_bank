package com.ibm.bank.model.service.account;

import java.math.BigDecimal;
import java.util.List;

import com.ibm.bank.model.persistence.account.Account;
import com.ibm.bank.model.persistence.exception.AccountNotFoundException;


public interface AccountService {
	
	public void addAccount(Account account);
	public Account updateAccount(String accountNumber,String accountHolderName,Double accountBalance ) throws AccountNotFoundException;
	public Account deleteAccount(String accountNumber)throws AccountNotFoundException;
	public List<Account> getAllAccounts();
	public Account findAccount(String accountNumber)throws AccountNotFoundException;

}
