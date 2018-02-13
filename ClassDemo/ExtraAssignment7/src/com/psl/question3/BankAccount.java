package com.psl.question3;

public class BankAccount {

	float balance;
	String accountType;

	public BankAccount(float balance, String accountType) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		this.accountType = accountType;
	}

	void withdraw(float amt) throws LowBalanceException, InsufficientFunds {
		float temp;

		if ((getBalance() < 1000.0f && accountType.equals("saving"))
				|| (getBalance() < 5000.0f && accountType.equals("current")))
			throw new InsufficientFunds();
		else {
			temp = balance - amt;
			if (temp < 1000)
				throw new LowBalanceException();
			else
				balance = temp;
		}

		System.out.println("After withdraw balance is" + getBalance());

	}

	void deposit(float amt) {

		balance += amt;
		System.out.println("After deposit balance is" + getBalance());

	}

	float getBalance() {
		return balance;
	}

}
