package com.psl.consoledemo;

import java.io.Console;

public class consoleDemo {

	public static void main(String[] args) {
		Console con = System.console();

		String str = con.readLine(" enter name");

		char ch[]=con.readPassword("Enter password");
		
		System.out.println("Name is "+str+" password is "+ch.toString());
	}

}
