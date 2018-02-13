package com.util;

/**
 * returns true if the email is valid must contain @ and . must not begin with .
 * and @
 * 
 * @author Administrator
 *
 */
public class ValidatorClass {

	public static boolean isValid(String email) {
		boolean validFlag = false;

		if (email.contains("@") && email.contains(".")) {
			if (email.startsWith("@") || email.startsWith("."))
				validFlag = false;
			else
				validFlag = true;
		}

		return validFlag;
	}
	
	public static float calculateSpeed(float distance,float time) {
		return (distance*time);
		
	}

}
