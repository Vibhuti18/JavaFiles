package com.psl.enumdemo;

public class EnumDemo {
	
	public static void main(String[] args) {
		
		
		System.out.println(Coffee.regular.getDeclaringClass());
		
		Coffee c[] = Coffee.values();
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("   "+c[i]);
			System.out.println(c[i].getPrice());
		}
	}

}
