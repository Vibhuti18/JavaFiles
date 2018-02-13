package com.psl.exception;

public class UserDefinedExceptions {
	


	public static void main(String[] args) {

		int age = 18;
		
		System.out.println("Befr assert");
		assert age >18 : "Invalid age";  //added as an error..do not wan to proceed if this is nt valid
		
		System.out.println("aftr assert");
		try {
			if (age < 18)
				throw new InvalidAgeException("Invalid age");
			else
				System.out.println("else");
		} catch (InvalidAgeException ia) {
			
			ia.printStackTrace();

		}
		
		System.out.println("All good");

	}

}
