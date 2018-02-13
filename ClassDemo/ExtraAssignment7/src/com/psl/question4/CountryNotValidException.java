package com.psl.question4;

public class CountryNotValidException extends Exception{
	
	public CountryNotValidException() {
		// TODO Auto-generated constructor stub
		super("The employee should be an Indian citizen for calculating tax");
	}

}
