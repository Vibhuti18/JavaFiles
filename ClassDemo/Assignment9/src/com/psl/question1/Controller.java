package com.psl.question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Controller {

	Set<Employee> set = new HashSet<Employee>();

	private void displayDetails() {
		// TODO Auto-generated method stub

		Iterator<Employee> it = set.iterator();

		Employee e = null;
		Vehicle t = null;
		while (it.hasNext()) {
			e = it.next();

			System.out.println(" Employee " + e.getEmployeeId() + " "
					+ e.getEmployeeName() + " " + e.getEmployeeSalary());
			Iterator<Vehicle> it1 = e.getListOfVehicles().iterator();
			while (it1.hasNext()) {
				t = it1.next();
				System.out.println("Vehicle " + t.getVehicleName() + " "
						+ t.getVehicleType());
			}

		}

	}

	private void addValues() {
		Vehicle v = null;
		// TODO Auto-generated method stub
		List<Vehicle> list;
		v = new Vehicle("Alto", "Maruti Suzuki");
		list = new ArrayList<Vehicle>();
		list.add(v);
		v = new Vehicle("AudiR8", "Audi");
		list.add(v);
		Employee e1 = new Employee(101, "Vibhuti", 500000, list);
		set.add(e1);

		v = new Vehicle("Polo", "Wolksawagon");
		list = new ArrayList<Vehicle>();
		list.add(v);
		Employee e2 = new Employee(102, "Pooja", 550000, list);
		set.add(e2);

		v = new Vehicle("Alto", "Maruti Suzuki");
		list = new ArrayList<Vehicle>();
		list.add(v);
		v = new Vehicle("AudiR8", "Audi");
		list.add(v);
		v = new Vehicle("Polo", "Wolksawagon");
		list.add(v);
		Employee e3 = new Employee(103, "Nidhi", 450000, list);
		set.add(e3);

		list = new ArrayList<Vehicle>();
		Employee e4 = new Employee(104, "Samrudhi", 900000, list);
		set.add(e4);

	}

	public static void main(String[] args) {

		Controller c = new Controller();
		c.addValues();
		c.displayDetails();

	}

}
