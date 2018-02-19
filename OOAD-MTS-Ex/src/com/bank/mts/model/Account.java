package com.bank.mts.model;

public class Account {
	
	private String num;
	private String holderName;
	private double balance;
	
	@Override
	public String toString() {
		return "num : "+this.getNum()+" ,balance : "+this.getBalance();
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
