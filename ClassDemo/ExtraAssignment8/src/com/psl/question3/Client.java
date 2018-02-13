package com.psl.question3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		List<Contact> listOfContacts = new ArrayList<Contact>();
		Controller controller = new Controller(listOfContacts);
		Contact contact = new Contact();
		Set<Contact> dbSet = new HashSet<Contact>();
		
	

		controller.addContact(contact, listOfContacts);

		try {
			controller.removeContact(contact, listOfContacts);
			Contact searchContact = controller.searchContactByName("geeta",
					listOfContacts);
			List<Contact> listWithSameNumbers = new ArrayList<Contact>();
			listWithSameNumbers = controller.SearchContactByNumber(
					"9923334462", listOfContacts);
			
			controller.addContactNumber(3, "7896541230", listOfContacts);
			controller.sortContactsByName(listOfContacts);
			controller.readContactsFromFile(listOfContacts, "Contact.txt");
			controller.serializeContactDetails(listOfContacts, "Contact.txt");
			controller.deserializeContact("SerializeContacts.ser");
			dbSet=controller.populateContactFromDb();
			boolean b =controller.addContacts(listOfContacts,dbSet);
		} catch (ContactNotFoundException e) {
			e.printStackTrace();
		}

	}

}
