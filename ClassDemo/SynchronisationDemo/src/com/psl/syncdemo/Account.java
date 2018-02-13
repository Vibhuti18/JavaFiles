package com.psl.syncdemo;

public class Account {
	
	volatile int balance;
	 
	public Account() {
		// TODO Auto-generated constructor stub
		
		balance = 10000;
	}
	
	public Account(int balance) {
		// TODO Auto-generated constructor stub
		
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
