package com.psl.question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {

	static List<CustomerBill> list = new ArrayList<CustomerBill>();

	static boolean isNegative(String s) {
		if (Double.parseDouble(s) < 0)
			return true;
		else
			return false;
	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public void calculateDiscount(ArrayList<CustomerBill> customer) {
		double discount;
		double npa;

		for (CustomerBill customerBill : customer) {
			if (customerBill.getTravelMonth().equals("April")
					|| customerBill.getTravelMonth().equals("May")
					|| customerBill.getTravelMonth().equals("June")
					|| customerBill.getTravelMonth().equals("July")
					|| customerBill.getTravelMonth().equals("August")) {

				discount = customerBill.getPackage1() - 0.3
						* customerBill.getPackage1() + customerBill.getFood()
						- 0.2 * customerBill.getFood();
				npa = customerBill.getPackage1() + customerBill.getFood()
						- discount;

			} else if (customerBill.getTravelMonth().equals("September")
					|| customerBill.getTravelMonth().equals("October")
					|| customerBill.getTravelMonth().equals("F ebruary")
					|| customerBill.getTravelMonth().equals("March")) {
				discount = customerBill.getPackage1() - 0.2
						* customerBill.getPackage1() + customerBill.getFood()
						- 0.1 * customerBill.getFood();
				npa = customerBill.getPackage1() + customerBill.getFood()
						- discount;
			} else if (customerBill.getTravelMonth().equals("November")
					|| customerBill.getTravelMonth().equals("January")) {
				discount = customerBill.getPackage1() - 0.1
						* customerBill.getPackage1() + customerBill.getFood()
						- 0.05 * customerBill.getFood();
				npa = customerBill.getPackage1() + customerBill.getFood()
						- discount;

			} else {
				discount = 0;
				npa = 0;
			}

			System.out.println("GoGio travels");
			System.out.println("Name: " + customerBill.getCustomerName());
			System.out.println("Package Cost: " + customerBill.getPackage1());
			System.out.println("Food: " + customerBill.getFood());
			System.out.println("Discount: " + discount);
			System.out.println("Net Payable Amount: " + npa+"\n");

		}

	}

	ArrayList<CustomerBill> getCustomerDetails(String fileName) {
		String str, s[];
		CustomerBill c;
		List<CustomerBill> list1 = new ArrayList<CustomerBill>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((str = br.readLine()) != null) {
				s = str.split("\t");
				if (s.length < 3)
					throw new NoDataFound();
				else if (!isNumeric(s[2]) || !isNumeric(s[2])
						|| isNegative(s[2])) { // System.out.println("isNegative(s[2]) "+isNegative(s[2])+"isNumeric(s[2]) "+isNumeric(s[2])+"isNumeric(s[2]) "+isNumeric(s[2]));
					throw new InvalidData();
				} else {
					c = new CustomerBill();
					c.setCustomerName(s[0]);
					c.setTravelMonth(s[1]);
					c.setPackage1(Double.parseDouble(s[2]));
					c.setFood(Double.parseDouble(s[3]));
					list1.add(c);
				}

			}

		} catch (NoDataFound | InvalidData e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (ArrayList<CustomerBill>) list1;
	}

	public static void main(String[] args) {
		Controller obj = new Controller();
		list = obj.getCustomerDetails("customer.txt");
		obj.calculateDiscount((ArrayList<CustomerBill>) list);

	}

}
