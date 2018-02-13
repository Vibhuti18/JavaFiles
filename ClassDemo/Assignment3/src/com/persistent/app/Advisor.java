package com.persistent.app;

public class Advisor {

	public String[] message = new String[5];

	public Advisor() {
		// TODO Auto-generated constructor stub
		message[0] = "Good";
		message[1] = "Bad";
		message[2] = "Excellent";
		message[3] = "worst";
		message[4] = "Average";
	}

	public String getAdvice() {
		int rand;
		rand = 1 + (int) (Math.random() * 5);
		return message[rand];
	}

}
