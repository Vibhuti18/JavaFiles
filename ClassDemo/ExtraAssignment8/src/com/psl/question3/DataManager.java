package com.psl.question3;

import java.util.List;
import java.util.Set;

public interface DataManager {

	void addContact(Contact contact, List<Contact> contacts);

	void removeContact(Contact contact, List<Contact> contacts)
			throws ContactNotFoundException;

	Contact searchContactByName(String name, List<Contact> contact)
			throws ContactNotFoundException;

	List<Contact> SearchContactByNumber(String number, List<Contact> contact)
			throws ContactNotFoundException;

	public void addContactNumber(int contactId, String contactNo,
			List<Contact> contacts);

	void sortContactsByName(List<Contact> contacts);

	void readContactsFromFile(List<Contact> contacts, String fileNAme);

	void serializeContactDetails(List<Contact> contacts, String filename);

	List<Contact> deserializeContact(String filename);

	public Set<Contact> populateContactFromDb();

	Boolean addContacts(List<Contact> existingContact, Set<Contact> newContacts);

}
