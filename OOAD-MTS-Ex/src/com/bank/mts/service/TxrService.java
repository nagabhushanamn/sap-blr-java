package com.bank.mts.service;

public interface TxrService {
	boolean transfer(double amount, String fromAccNum, String toAccNum);
}
