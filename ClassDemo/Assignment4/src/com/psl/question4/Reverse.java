package com.psl.question4;

import java.util.Scanner;

public class Reverse {
	private static Scanner sc;

	static String makeReverse(String str) {

		String str1 = new String();
		StringBuilder st;

		String[] splitUpByLines = str.split(" ");
		
		for(int i=0;i<splitUpByLines.length;i++)
		{
			//System.out.println(splitUpByLines[i]);
			st = new StringBuilder();
			st.append(splitUpByLines[i]);
			
			System.out.print(str1.concat((String)st.reverse().toString()));
			System.out.print(" ");
			
		}

		return str1;

	}

	public static void main(String[] args) {

		String str;
		Reverse cc;
		cc = new Reverse();
		sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		String reversed = makeReverse(str);
		System.out.println(reversed);
	}

}
