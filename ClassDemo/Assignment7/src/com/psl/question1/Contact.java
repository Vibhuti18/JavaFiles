package com.psl.question1;

import java.util.Date;

public class Contact {

	String firstName, middleName, lastName;
	Date dateOfBirth;
	char gender;
	String anniversary, address, area, city, country, state, email, website;
	int pinCode;
	String telephoneNumber, mobileNumber;

	public Contact(String firstName, String middleName, String lastName,
			Date dateOfBirth, char gender, String email,
			String telephoneNumber, String mobileNumber) {
		// TODO Auto-generated constructor stub
		anniversary = "Birthday";
		address = "Fatorda";
		city = "Margao";
		country = "India";
		state = "Goa";
		website = "www.psl.co.in";
		pinCode = 403602;

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;

	}

	public void validate() {

		try {
			if (firstName == " " || middleName == " " || lastName == " "
					|| dateOfBirth == null || email == " ")
				throw new MissingParameterExceotion("Parameters are missing");

		} catch (MissingParameterExceotion ua) {
			// TODO: handle exception

			ua.printStackTrace();

		}

		try {
			if (!(email.contains("@") && email.contains(".com")))
				throw new InvalidEmailException("EmailId is Invalid");

		} catch (InvalidEmailException wrongEmail) {
			wrongEmail.printStackTrace();
		}

		try {
			if ((telephoneNumber.contains(" ") && mobileNumber.contains(" ")))
				throw new InvalidEmailException("Add atleast one phone number");
		} catch (InvalidEmailException m) {
			m.printStackTrace();
		}
	}

}