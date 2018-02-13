package com.psl.question4;

public class CalculatorSimulator {

	public static void main(String[] args) {

		TaxCalculator tc = new TaxCalculator();
		try {
			double d = tc.calculateTax("Vibhuti", true, 5000);
			System.out.println("Tax amount is " + d);
		} catch (CountryNotValidException | EmployeeNameInvalidException
				| TaxNotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
