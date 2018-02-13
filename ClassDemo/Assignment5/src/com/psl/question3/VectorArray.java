package com.psl.question3;

import java.util.Scanner;
import java.util.Vector;

public class VectorArray {

	Vector<Name> nameOfPerson = new Vector<Name>();
	static Scanner s = new Scanner(System.in);

	void addToVector(Name n) {
		nameOfPerson.add(n);
	}

	void display() {
		for (int i = 0; i < nameOfPerson.size(); i++) {
			System.out.println(nameOfPerson.get(i).getFirstName() + " "
					+ nameOfPerson.get(i).getLastName());
		}
	}

	public static void main(String[] args) {

		VectorArray v = new VectorArray();
		int choice;
		int h = 0;
		Name n = null;
		do {
			System.out.println("Enter your choice");
			choice = s.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter FirstName and LastName");
				n = new Name();
				n.setFirstName(args[2 * h]);
				n.setLastName(args[2 * h + 1]);
				h++;
				v.addToVector(n);

				break;
			case 2:
				v.display();
				break;
			case 3:
				System.out.println("Goodbye");

				break;

			default:
				break;
			}
		} while (choice != 3);

	}

}
