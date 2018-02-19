package com.bank.mts.repository;

import java.util.HashMap;
import java.util.Map;

import com.bank.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static Map<String, Account> memoryDb = new HashMap();

	static {
		Account account1 = new Account();
		account1.setNum("1");
		account1.setBalance(1000.00);
		account1.setHolderName("A");

		Account account2 = new Account();
		account2.setNum("2");
		account2.setBalance(1000.00);
		account2.setHolderName("B");

		memoryDb.put("1", account1);
		memoryDb.put("2", account2);
	}

	@Override
	public Account loadAccount(String num) {
		return memoryDb.get(num);
	}

	@Override
	public boolean updateAccount(Account account) {
		Account existingAccount = memoryDb.get(account.getNum());
		existingAccount.setBalance(account.getBalance());
		return true;
	}

}
