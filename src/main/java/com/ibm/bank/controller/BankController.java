package com.ibm.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bank.model.persistence.account.Account;
import com.ibm.bank.model.persistence.exception.AccountNotFoundException;
import com.ibm.bank.model.service.account.AccountService;

@RestController
@ComponentScan("com.ibm.bank")
public class BankController {
	
	private AccountFormBean accountFormBean;
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/getAccount", method = RequestMethod.GET)
	@ResponseBody
	public List<Account> getAllAccounts() {
		
		return accountService.getAllAccounts();
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Account saveAccount(@RequestBody Account account) {

		accountService.addAccount(account);
		return account;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ResponseBody
	public Account updateAccount(@RequestBody Account account) throws AccountNotFoundException {

		accountService.updateAccount(account.getAccountNumber(), account.getAccountHolderName(), account.getAccountBalance());
		return account;
	}
	
	@RequestMapping(value = "/delete/{accountNumber}", method = RequestMethod.DELETE)
	@ResponseBody
	public Account deleteAccount(@PathVariable("accountNumber") String accountNumber) throws AccountNotFoundException {
	
		return accountService.deleteAccount(accountNumber);

	}
}
