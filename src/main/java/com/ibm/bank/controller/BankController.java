package com.ibm.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bank.model.persistence.account.Account;
import com.ibm.bank.model.service.account.AccountService;

@RestController
@ComponentScan("com.ibm.bank")
public class BankController {
	
	private AccountFormBean account;
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(ModelMap model) {
		System.out.println("home");
		
		account = new AccountFormBean("503","neha",500000.00);
		System.out.println(account);
		accountService.addAccount(new Account(account.getAccountNumber(), account
				.getAccountHolderName(), account.getAccountBalance(), "Active"));
		
		return "Spring boot is working!";
		//return "index";
	}
}
