package com.psl.question6;

import java.time.temporal.ChronoUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Client {

	Set<Employee> set = new TreeSet<Employee>(new Cm());

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);

	String month;

	public void addEmployees(Employee e) {

		set.add(e);
		System.out.println("Entry added");
		System.out.println(set.toString());
	}

	public void search() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter month");
		int flag = 0;
		month = s.next();
		for (Employee employee : set) {

			if (employee.d.month.equals(month)) {
				System.out.println(employee.getEmployee_Name() + " "
						+ employee.d.getDay() + " " + employee.d.getMonth()
						+ " " + employee.d.getYear());
				flag = 1;
			}

		}

		if (flag == 0)
			System.out.println("No records found");

	}

	public long Experience(Date d1) {

		Date input = new Date();
		LocalDate currentDate = input.toInstant()
				.atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate joinDate = d1.toInstant().atZone(ZoneId.systemDefault())
				.toLocalDate();

		return ChronoUnit.DAYS.between(currentDate, joinDate);

	}

	private void menu() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int op = 0;
		do {
			System.out
					.println(" 1.Add Employee \n 2.Search Employee \n 3.Work experience \n 4.Gratuity eligibility \n 5.Sort by experience");

			op = s.nextInt();
			switch (op) {
			case 1:
				Employee e = new Employee();

				try {

					System.out.println("Enter employee details ");
					System.out
							.println("ID: NAME: TELEPHONE: DOJ: DAY: MONTH: YEAR:");
					e.setEmployee_ID(s.nextInt());
					e.setEmployee_Name(s.next());
					e.setEmployee_Telephone(s.nextLong(10));
					e.setEmployee_DOJ(sdf.parse(s.next()));
					e.d = new DOB();
					e.d.setDay(s.nextInt());
					e.d.setMonth(s.next());
					e.d.setYear(s.nextInt());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				addEmployees(e);
				break;
			case 2:
				System.out.println(set);
				search();
				break;
			case 3:
				long workExperience;
				int m,
				d,
				y;
				for (Employee employee : set) {
					workExperience = Experience(employee.getEmployee_DOJ());

					y = Math.abs((int) (workExperience / 365));
					workExperience = workExperience % 365;
					m = Math.abs((int) (workExperience / 30));
					d = Math.abs((int) (workExperience % 30));

					System.out.println(employee.getEmployee_ID() + " " + y
							+ " years" + m + " months" + d + "days ");
				}

				break;

			case 4:

				System.out.println("Gratuity eligibility");
				int y1;
				for (Employee employee : set) {
					workExperience = Experience(employee.getEmployee_DOJ());
					y1 = Math.abs((int) (workExperience / 365));
					if (y1 >= 5)
						System.out.println(employee.getEmployee_ID() + " "
								+ employee.getEmployee_Name());
				}

			case 5:
				System.out.println("Sorted by work experience");
				System.out.println(set);

			case 6:
				break;
			}
		} while (op != 6);

	}

	public static void main(String[] args) {

		Client c = new Client();
		c.menu();

	}

}
