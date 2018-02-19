package com.bank.mts.service;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;

	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public boolean transfer(double amount, String fromAccNum, String toAccNum) {

		// load from & to accounts
		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		// update both account
		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);

		return true;
	}

}
