package com.psl.question5;



public class Adder extends Arithmetic {
	
	public static void main(String[] args) {
		
		
		Arithmetic a = new Adder();
		int sum = a.add(1,2);
		System.out.println("Sum : "+sum);
	}

}
