package com.psl.question4;

public class TaxNotEligibleException extends Exception {

	public TaxNotEligibleException() {
		// TODO Auto-generated constructor stub
		super("The employee does not need to pay tax");
	}
}
