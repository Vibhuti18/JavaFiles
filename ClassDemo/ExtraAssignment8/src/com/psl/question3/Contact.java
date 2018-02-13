package com.psl.question3;

import java.io.Serializable;
import java.util.List;

public class Contact implements Comparable<Contact>,Serializable {

	int contactID;
	String ContactName;
	String EmailAddress;
	List<String> contactNumber;

	public int getContactID() {
		return contactID;
	}

	public void setContactID(int contactID) {
		this.contactID = contactID;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public List<String> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(List<String> contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return ContactName.compareTo(o.getContactName());
	}

	@Override
	public String toString() {
		return "contactID=" + contactID + ", ContactName=" + ContactName
				+ ", EmailAddress=" + EmailAddress + ", contactNumber="
				+ contactNumber;
	}

}
