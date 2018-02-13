package com.psl.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Client {
	ConnectionClass c = new ConnectionClass();
	Connection con = c.connectMethod();
	int flag = 0;

	ArrayList<Store> storelist = new ArrayList<Store>();
	Map<Person, ArrayList<Store>> GroceryItems = new HashMap<Person, ArrayList<Store>>();

	void addPerson() {
		try (Scanner sc = new Scanner(System.in)) {
			Person person = new Person();
			PreparedStatement pstmt = con
					.prepareStatement("insert into person values(?,?,?)");

			System.out.println("Enter person details");
			System.out.println("ID: ");
			person.setPersonID(sc.nextInt());
			System.out.println("NAme: ");
			person.setPersonName(sc.next());
			System.out.println("Person Telephone:");
			person.setPersonTelephone(sc.nextLong());

			pstmt.setInt(1, person.getPersonID());
			pstmt.setString(2, person.getPersonName());
			pstmt.setLong(3, person.getPersonTelephone());
			pstmt.execute();
			System.out.println("query success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Person createPersons(String name) {
		ResultSet rs;
		String s2[];
		Person person = null;
		PreparedStatement pstmt;
		s2 = name.split(",");
		try {
			person = new Person();
			pstmt = con
					.prepareStatement("select personid from person where person_name =?");
			pstmt.setString(1, s2[0]);
			rs = pstmt.executeQuery();

			while (rs.next())
				person.setPersonID(rs.getInt(1));
			person.setPersonName(s2[0]);
			person.setPersonTelephone(Long.parseLong(s2[1]));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;

	}

	public void createGrocery(String gro) {
		ResultSet rs;
		String s1[] = null, s2[];
		Store store = null;
		s2 = gro.split(";");
		for (int i = 0; i < s2.length; i++) {
			s1 = s2[i].split(",");
			try {
				store = new Store();
				PreparedStatement pstmt = con
						.prepareStatement("select groceryId,groceryType,price from grocery where groceryName= ?");
				pstmt.setString(1, s1[0]);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					store.setItemId(rs.getInt(1));
					store.setItemType(Grocery.valueOf(rs.getString(2)));
					store.setItemPrice(rs.getInt(3));
				}
				store.setItemName(s1[0]);
				store.setItemQuantity(Float.parseFloat(s1[1]));
				storelist.add(store);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void manageOrders() {

		String str, s[];
		Person person;
		int count = 1;
		try (BufferedReader br = new BufferedReader(new FileReader("order.txt"))) {
			while ((str = br.readLine()) != null) {
				storelist = new ArrayList<Store>();
				s = str.split(":");
				person = new Person();
				person = createPersons(s[0]);
				for (int i = 1; i < s.length; i++) {
					createGrocery(s[i]);
				}
				addToMap(person, storelist);
				count++;
			}
		} catch (Exception e) {
		}
	}

	public void addToMap(Person p, ArrayList<Store> q) {
		GroceryItems.put(p, q);
	}

	public void serachPerson() {
		ResultSet rs;
		String name = null, str, str1;
		Scanner s = new Scanner(System.in);
		Person p = null;
		System.out.println("enter name:");
		try {
			name = s.next();
			PreparedStatement pstmt = con
					.prepareStatement("select personid from person where person_name= ?");
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if (!rs.next())
				throw new UserNotFound();
			else {

				do {
					System.out.println(" " + rs.getInt(1));

				} while (rs.next());
			}

		} catch (UserNotFound e) {
			Map<Person, ArrayList<Store>> newEntryMap = new HashMap<Person, ArrayList<Store>>();
			PreparedStatement pstmt;
			try {
				pstmt = con
						.prepareStatement("insert into person values(?,?,?)");
				System.out.println("New User Entry ");
				p = new Person();
				System.out.println("Ente Phone");
				str1 = s.next();
				System.out
						.println(" Enter shopping items and quantity (Item name,quantity) separated by semicolon");
				str = s.next();
				p = createPersons(name + "," + str1);
				pstmt.setInt(1, 108);
				pstmt.setString(2, name);
				pstmt.setLong(3, Long.parseLong(str1));
				pstmt.execute();
				System.out.println("Query success");

				storelist = new ArrayList<Store>();
				createGrocery(str);
				newEntryMap.put(p, storelist);

				List<Store> displayList = null;
				float total = 0;
				System.out
						.println("PersonName		GroceryType		Quantity (Kgs.)		Price");
				for (Entry<Person, ArrayList<Store>> string : newEntryMap
						.entrySet()) {

					System.out.println(string.getKey().getPersonName());
					displayList = new ArrayList<Store>();
					displayList = string.getValue();
					for (Store store : displayList) {
						total = total + store.getItemPrice()
								* store.getItemQuantity();
						System.out.print("			  " + store.getItemName()
								+ "			  " + store.getItemQuantity() + "			  "
								+ store.getItemPrice() + "\n");
					}
					System.out
							.println("__________________________________________________________________________________________________________");
					System.out
							.println("Total 		                                                                           "
									+ (total - 0.2 * total));
					total = 0;
				}
				System.out.println();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void generateBill() {
		List<Store> displayList = null;
		float total = 0;
		System.out.println("PersonName		GroceryType		Quantity (Kgs.)		Price");
		for (Entry<Person, ArrayList<Store>> string : GroceryItems.entrySet()) {

			System.out.println(string.getKey().getPersonName());
			displayList = new ArrayList<Store>();
			displayList = string.getValue();
			for (Store store : displayList) {
				total = total + store.getItemPrice() * store.getItemQuantity();
				System.out.print("			  " + store.getItemName() + "			  "
						+ store.getItemQuantity() + "			  "
						+ store.getItemPrice() + "\n");
			}
			System.out
					.println("__________________________________________________________________________________________________________");
			System.out
					.println("Total 		                                                                           "
							+ total);
			total = 0;

		}

		System.out.println();
	}
	public static void main(String[] args) {
		Client client = new Client();
	     client.manageOrders();
		client.serachPerson();
		 client.generateBill();
	}
}
