package com.abc.tax;

public class TaxCalculator {

	float basicSalary;
	boolean citizenship;
	float nettsalary;
	float tax;

	public TaxCalculator(float basic, boolean citizen) {
		// TODO Auto-generated constructor stub
		basicSalary = basic;
		citizenship = citizen;
		nettsalary = 0f;
		tax = 0f;

	}

	public void calculateTax() {

		tax = 30 * basicSalary / 100;
		System.out.println("The Tax is " + tax + " for the " + basicSalary
				+ ". ");

	}

	public void deductTax() {

		nettsalary = basicSalary - tax;
		System.out.println("The nettSalary is " + nettsalary + ". ");

	}

	public void validateSalary() {

		if (citizenship == true && basicSalary > 100000.0f)
			System.out
					.println("The salary and citizenship eligibility criteria is satisfied.");

	}

	public static void main(String[] args) {

		TaxCalculator t = new TaxCalculator(1000000, true);
		t.calculateTax();
		t.deductTax();
		t.validateSalary();

	}

}
