package com.psl.assignment1;

public class Question1 {

	private boolean result;
	static String productNames[];

	static String[] initProductNames()

	{
		productNames = new String[5];
		productNames[0] = "samsung";
		productNames[1] = "moto";
		productNames[2] = "nokia";
		productNames[3] = "one plus";
		productNames[4] = "vivo";

		return productNames;

	}

	static boolean isPresent(String[] productNames, String keyword) {
		int c = 0;
		int count = 0;

		while (count < productNames.length) {
			if (productNames[count].equals(keyword)) {
				c = 1;
				break;
			}

			count++;
		}

		if (c == 1)
			return true;
		else
			return false;

	}

	public static void main(String args[]) {

		Question1 obj = new Question1();

		obj.result = obj.isPresent(Question1.initProductNames(), "moto");

		if (obj.result)
			System.out.println("Product exists");
		else
			System.out.println("Product does not exist");

	}
}
