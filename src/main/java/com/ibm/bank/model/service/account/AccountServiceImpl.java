package com.ibm.bank.model.service.account;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bank.model.persistence.account.Account;
import com.ibm.bank.model.persistence.account.AccountDao;
import com.ibm.bank.model.persistence.account.AccountRepository;
import com.ibm.bank.model.persistence.exception.AccountNotFoundException;

@Service
public class AccountServiceImpl implements AccountService{
	
	
	@Autowired 
	private AccountDao accountDao;
	
	
	public AccountServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	  public AccountServiceImpl(AccountDao accountDao) { 
		  super(); 
		  this.accountDao = accountDao;
	}
	 
	
	
	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		accountDao.addAccount(account);	
	}



	@Override
	public Account updateAccount(String accountNumber, String accountHolderName, Double accountBalance) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return accountDao.updateAccount(accountNumber, accountHolderName, accountBalance);
	}



	@Override
	public Account deleteAccount(String accountNumber) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return accountDao.deleteAccount(accountNumber);
	}



	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.getAllAccounts();
	}



	@Override
	public Account findAccount(String accountNumber) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return accountDao.findAccount(accountNumber);
	}
	

}
