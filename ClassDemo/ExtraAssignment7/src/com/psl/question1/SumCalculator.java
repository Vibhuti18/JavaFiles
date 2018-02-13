package com.psl.question1;

import java.util.Scanner;

public class SumCalculator {

	public double sumOfFirstNOdd(int n) {
		double sum = 0.0;

		if (n < 0) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException | NumberFormatException e) {
				e.printStackTrace();
			} finally {
				System.out.println(" Program ended");
			}

		} else {

			sum += Math.pow(n, 2.0);
			System.out.println(sum);
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		SumCalculator s1 = new SumCalculator();
		double d = s1.sumOfFirstNOdd(s.nextInt());
		s.close();

	}

}
