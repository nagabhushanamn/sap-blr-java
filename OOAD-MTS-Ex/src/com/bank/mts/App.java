package com.bank.mts;

import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.JdbcAccountRepository;
import com.bank.mts.service.TxrService;
import com.bank.mts.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// Init
		AccountRepository accountRepository = new JdbcAccountRepository();
		TxrService txrService = new TxrServiceImpl(accountRepository);

		// Use
		boolean status = txrService.transfer(300.00, "1", "2");
		System.out.println(status ? "Txr success " : "Txr Failed");
		
		//----------------------------------------------------
		System.out.println(accountRepository.loadAccount("1"));
		System.out.println(accountRepository.loadAccount("2"));
		//-----------------------------------------------------

	}

}
