package com.psl.question3;

public class InvalidAmount extends Exception {
	
	public InvalidAmount() {
		// TODO Auto-generated constructor stub
		
		super("Invalid Exception");
		System.err.println("Transaction terminated!");
	}

}
