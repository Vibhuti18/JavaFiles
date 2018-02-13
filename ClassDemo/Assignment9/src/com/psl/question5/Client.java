package com.psl.question5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Client {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);
	static Set<Employee> set1 = new TreeSet<Employee>();
	static Set<Employee> set2 = new TreeSet<Employee>(
			new Comparator<Employee>() {

				@Override
				public int compare(Employee e1, Employee e2) {
					int i = e1.getJoiningDate().compareTo(e2.getJoiningDate());

					if (i == -1)
						return -1;
					else

						return 1;

				}
			});

	private void beforeEnteredDate(String string) {
		// TODO Auto-generated method stub

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		try {
			Iterator<Employee> it = set1.iterator();
			Employee e = new Employee();
			c1.setTime(sdf.parse(string));
			while (it.hasNext()) {
				e = it.next();
				c2.setTime(e.getJoiningDate());
				int p = c2.compareTo(c1);

				if (p == -1) {
					System.out.println(e.getEmployeeName()
							+ " has joined before " + string);
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void displaySixMonthEmployees(String str) {
		// TODO Auto-generated method stub
		// employees who have completeed six months in the organisation
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		try {
			Iterator<Employee> it = set1.iterator();
			Employee e = new Employee();
			c1.setTime(sdf.parse(str));
			while (it.hasNext()) {
				e = it.next();
				c2.setTime(e.getJoiningDate());
				int c = c1.get(c1.YEAR) - c2.get(c2.YEAR);
				int pp = c1.get(c1.MONTH) - c2.get(c2.MONTH);
				if (Math.abs(c) > 1 || Math.abs(pp) > 6) {

					System.out.println(e.getEmployeeName());
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws ParseException {

		Client client = new Client();
		Date d = new Date();

		Employee e1 = new Employee(101, "Vibhuti", 500000,
				sdf.parse("18/12/2005"));
		Employee e2 = new Employee(102, "Pooja", 550000,
				sdf.parse("10/10/2017"));
		Employee e3 = new Employee(103, "Nidhi", 450000,
				sdf.parse("17/03/2013"));
		Employee e4 = new Employee(104, "Samrudhi", 900000,
				sdf.parse("15/01/2016"));
		Employee e5 = new Employee(105, "Annalisa", 3500000,
				sdf.parse("24/04/2017"));

		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		set1.add(e4);
		set1.add(e5);

		set1.add(new Employee(105, "Pearl", 3500000, new Date()));
		set2.addAll(set1);

		Iterator<Employee> it = set1.iterator();
		System.out.println("All the employees are");

		while (it.hasNext()) {

			System.out.println(it.next().toString());
		}

		System.out.println("Employes joined befor entered date are");
		client.beforeEnteredDate("20/05/2015");

		client.displaySixMonthEmployees("19/10/2017");
		// client.asPerJoiningDate();

		System.out.println("Sorted as per joining date");
		Iterator<Employee> it2 = set2.iterator();
		while (it2.hasNext()) {

			System.out.println(it2.next().toString());
		}

	}

}
