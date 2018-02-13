package com.psl.question1;

import java.io.IOException;
import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = s.nextLine();
		System.out.println(str);

		System.out.println("Enter 2 integers");
		int i = s.nextInt();
		int j = s.nextInt();

		System.out.println("The substring is" + str.substring(i, j));

		s.close();

	}

}
