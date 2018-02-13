package com.psl.question3;

public class LowBalanceException extends Exception{

	
	public LowBalanceException() {
		// TODO Auto-generated constructor stub
		
		super("Low balance in the account or after withdrawal");
	}
}
