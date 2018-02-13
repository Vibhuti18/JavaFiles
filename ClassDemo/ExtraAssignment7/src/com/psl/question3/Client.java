package com.psl.question3;

public class Client {

	static BankAccount ba = null;

	public Client(BankAccount b) {
		// TODO Auto-generated constructor stub
		this.ba = b;
	}

	public static void main(String[] args) {
		Client c = new Client(new BankAccount(3000, "current"));

		int amt = 1000;
		try {
			if (amt < 0)
				throw new InvalidAmount();
			else if (ba.getBalance() < 1000) {
				throw new LowBalanceException();
			} else {
				ba.deposit(amt);
				ba.withdraw(4000);
				System.out.println("successfull transaction");
			}
		} catch (InvalidAmount | LowBalanceException | InsufficientFunds e) {
			e.printStackTrace();
		}

	}

}
