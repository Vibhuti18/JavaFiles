package com.psl.question5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Client {

	Map<String, String> map = new HashMap<String, String>();
	Scanner s = new Scanner(System.in);
	int op;
	String name;

	public void menu() {

		do {
			System.out
					.println("1.Add new phone book entry \n 2.Search Phone Number \n 3.Quit");
			op = s.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter phone number and name");
				map.put(s.next(), s.next());
				System.out.println("Entry added");

				break;
			case 2:
				System.out.println("enter name");
				name = s.next();
				for (Entry<String, String> string : map.entrySet())
					if (string.getValue().equals(name))
						System.out.println("The phone number is "
								+ string.getKey());
				break;
			case 3:
				break;
			}
		} while (op != 3);

	}

	public static void main(String[] args) {

		Client c = new Client();
		c.menu();
	}
}
