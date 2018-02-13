package com.psl.string;

public class StringDemo {
	
	public static void main(String[] args) {
		String str1 = new String("Persistent");
		String str2 = new String("Persistent");
		String str3 = "Persistent";
		String str4 = "Persistent";
		
		
		System.out.println(str1 == str2);  //false
		
		System.out.println(str1 == str3); //false
		System.out.println(str3 == str4); //true
		
	}

}
