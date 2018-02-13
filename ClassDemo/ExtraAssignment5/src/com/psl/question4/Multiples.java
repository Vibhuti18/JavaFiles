package com.psl.question4;

import java.util.Scanner;

public class Multiples {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("enter a number");
		num = s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(i*num));
		}
		
		s.close();
		
	}

}
