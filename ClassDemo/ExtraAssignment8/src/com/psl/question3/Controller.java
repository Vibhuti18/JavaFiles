package com.psl.question3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller implements DataManager {

	List<Contact> controllercContacts;
	Connection con = null;

	public Controller(List<Contact> contacts) {
		// TODO Auto-generated constructor stub
		this.controllercContacts = contacts;
	}

	public void addContact(Contact contact, List<Contact> contacts) {

		controllercContacts.clear();
		controllercContacts.add(contact);
		contacts.add(contact);
	}

	public void removeContact(Contact contact, List<Contact> contacts)
			throws ContactNotFoundException {
		int flag = 0;
		for (Contact contact2 : contacts) {
			if (contact2.getContactID() == contact.getContactID()) {
				flag = 1;
				contacts.remove(contact2);
			}
		}

		if (flag == 0)
			throw new ContactNotFoundException("Contact not found");
		controllercContacts.clear();
		controllercContacts.addAll(contacts);
	}

	public Contact searchContactByName(String name, List<Contact> contact)
			throws ContactNotFoundException {

		Contact sContact = new Contact();
		int flag = 0;
		for (Contact contact2 : contact) {
			if (contact2.getContactName().equals(name)) {
				flag = 1;
				sContact = contact2;
				break;
			}
		}
		controllercContacts.clear();
		controllercContacts.addAll(contact);
		if (flag == 0)
			throw new ContactNotFoundException("Contact not found");
		else
			return sContact;

	}

	public List<Contact> SearchContactByNumber(String number,
			List<Contact> contact) throws ContactNotFoundException {
		List<Contact> contactWithSameNumbers = new ArrayList<Contact>();
		int flag = 0;
		for (Contact contact2 : contact) {
			for (String st : contact2.getContactNumber()) {
				{
					if (st.equals(number))
						flag = 1;
					break;
				}
			}
			if (flag == 1) {
				contactWithSameNumbers.add(contact2);
				flag = 0;
			}

		}
		controllercContacts.clear();
		controllercContacts.addAll(contact);
		return contactWithSameNumbers;

	}

	public void addContactNumber(int contactId, String contactNo,
			List<Contact> contacts) {

		for (Contact contact : contacts) {
			if (contact.getContactID() == contactId) {
				contact.getContactNumber().add(contactNo);
				break;
			}

		}
		controllercContacts.clear();
		controllercContacts.addAll(contacts);

	}

	public void sortContactsByName(List<Contact> contacts) {
		contacts.sort(null);
		System.out.println("Sorted list is ");
		for (Contact contact : contacts) {
			System.out.println(contact.toString());
		}
		controllercContacts.clear();
		controllercContacts.addAll(contacts);

	}

	public void readContactsFromFile(List<Contact> contacts, String fileNAme) {
		String str, s1[];
		Contact c = null;
		List<String> temp = null;

		try (BufferedReader br = new BufferedReader(new FileReader(fileNAme))) {

			while ((str = br.readLine()) != null) {
				c = new Contact();
				s1 = str.split(",");
				c.setContactID(Integer.parseInt(s1[0]));
				c.setContactName(s1[1]);
				c.setEmailAddress(s1[2]);
				temp = new ArrayList<String>();
				for (int i = 3; i < s1.length; i++) {
					temp.add(s1[i]);
				}
				c.setContactNumber(temp);

			}

			controllercContacts.clear();
			controllercContacts.addAll(contacts);

			System.out.println();
		} catch (Exception e) {

		}

	}

	public void serializeContactDetails(List<Contact> contacts, String filename) {

		String str, s1[];
		Contact c = null;
		List<String> temp = null;

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			while ((str = br.readLine()) != null) {
				c = new Contact();
				s1 = str.split(",");
				c.setContactID(Integer.parseInt(s1[0]));
				c.setContactName(s1[1]);
				c.setEmailAddress(s1[2]);
				temp = new ArrayList<String>();
				for (int i = 3; i < s1.length; i++) {
					temp.add(s1[i]);
				}
				c.setContactNumber(temp);

			}

			controllercContacts.clear();
			controllercContacts.addAll(contacts);

			System.out.println();
		} catch (Exception e) {

		}

		File f1 = new File("SerializeContacts.ser");

		try {
			if (!f1.exists()) {
				System.out.println("file not found");
				f1.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileOutputStream fis;
		try {
			fis = new FileOutputStream(f1);
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(controllercContacts);
			System.out.println(" done serializing ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Contact> deserializeContact(String filename) {
		List<Contact> listContacts = new ArrayList<Contact>();

		try {
			Contact c = null;

			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (fis.available() > 0) {
				c = new Contact();
				c = (Contact) ois.readObject();
				listContacts.add(c);
			}

		} catch (FileNotFoundException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // TODO Auto-generated
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listContacts;

	}

	public Set<Contact> populateContactFromDb() {

		con = new ConnectionClass().connectMethod();
		Set<Contact> contactSet = new HashSet<Contact>();
		Contact c = null;
		ResultSet rs;
		String str, s[];
		List<String> temp = new ArrayList<String>();
		String query = "select contactId,contactName,contactEmail,contactList from contact_tbl ";

		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				c = new Contact();
				c.setContactID(rs.getInt(1));
				c.setContactName(rs.getString(2));
				c.setEmailAddress(rs.getString(3));
				str = rs.getString(4);
				s = str.split(",");
				for (int i = 0; i < s.length; i++) {
					temp.add(s[i]);
				}
				c.setContactNumber(temp);
				contactSet.add(c);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contactSet;
	}

	public Boolean addContacts(List<Contact> existingContact,
			Set<Contact> newContacts) {

		existingContact.addAll(newContacts);
		return true;

	}
}
