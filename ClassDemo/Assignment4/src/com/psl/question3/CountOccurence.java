package com.psl.question3;

import java.util.Scanner;

public class CountOccurence {
	
	private static Scanner sc;
	

	static int check(String str,String word){
		
		int i1=0;
		String[] splitUpByLines = str.split(" ");
		for(int i =0;i<splitUpByLines.length;i++)
		{
			if(splitUpByLines[i].equalsIgnoreCase(word))
				i1++;
		}
		
		
		return i1;
		
		
	}
	
	public static void main(String[] args) {
		String str,word;
		 CountOccurence cc;
		cc = new CountOccurence();
		sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		
		System.out.println("enter the word to be checked for occurence");
		word = sc.next();
		int i = CountOccurence.check(str, word);
		System.out.println(i);
		
	}

}
