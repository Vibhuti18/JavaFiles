package com.psl.question3;

public class InsufficientFunds extends Exception{
	
	public InsufficientFunds() {
		// TODO Auto-generated constructor stub
		
		super("InsufficientFunds");
		System.err.println("Low on balance");
	}

}
