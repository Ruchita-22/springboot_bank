package com.ibm.bank.model.persistence.account;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.bank.model.persistence.exception.AccountNotFoundException;



@Repository
public class AccountDaoImpl implements AccountDao {
	
	 @Autowired 
	 private AccountRepository accountRepository;



	public AccountDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	  public AccountDaoImpl(AccountRepository accountRepository) { 
		  super();
		  this.accountRepository = accountRepository; 
	  }
	 

	@Override
	public void addAccount(Account account) {
		accountRepository.save(account); 
	}



	@Override
	public Account updateAccount(String accountNumber, String AccountHolderName, BigDecimal AccountBalance)
			throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Account deleteAccount(String accountNumber) throws AccountNotFoundException {
		return null;
		// TODO Auto-generated method stub
		//Optional<Account> account=accountRepository.findById(accountNumber);
		
		//return accountRepository.deleteById(accountNumber);
	}



	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return (List<Account>) accountRepository.findAll();
	}



	@Override
	public Account findAccount(String accountNumber) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		Optional<Account> account=accountRepository.findById(accountNumber);
		System.out.println(account);
		return null;
	}
	

}
