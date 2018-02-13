package com.psl.wrapperdemo;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int a =10 ;
		
		System.out.println(a);
		Integer i = new Integer(a);
		System.out.println(i);
		
		
		Integer i1 = a;     //autoboxing
		System.out.println(i1); 
		
		
		int c = i1.intValue();
		
		System.out.println(c);
		int b = i1; //autounboxing
		System.out.println(b);
		
		
		String str = "10";
		System.out.println(str + 10);
		int a3 = Integer.parseInt(str);
		System.out.println(a3);
		String str1 = String.valueOf(a3);
		System.out.println("      "+str);
	}
	}
	
	
