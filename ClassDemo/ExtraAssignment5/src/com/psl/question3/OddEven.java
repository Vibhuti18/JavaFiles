package com.psl.question3;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("enter a number");
		num = s.nextInt();

		if (num % 2 == 0) {
			if (num >= 2 && num <= 5)
				System.out.println("Num is even and between 2 to 5");

			else if (num >= 6 && num <= 20)
				System.out.println("Num is even and between 6 to 20");
			else
				
				System.out.println("Num is even and greater than 20");
		}
		
		else
			System.out.println("Num is odd");

		s.close();
	}

}
