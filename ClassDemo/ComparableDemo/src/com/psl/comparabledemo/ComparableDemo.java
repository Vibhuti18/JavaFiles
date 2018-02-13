package com.psl.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(10, 200000, "Flash");
		Employee e2 = new Employee(5, 300000, "Arrow");
		Employee e3 = new Employee(16, 400000, "Joeey");

		List<Employee> obj = new ArrayList<Employee>();

		obj.add(e1); // employee beans
		obj.add(e2);
		obj.add(e3);
		System.out.println("List before sort" + obj);
		Collections.sort(obj);
		System.out.println("List after sort" + obj);

		// Collections.sort(obj, new SortBySalary());

		Collections.sort(obj, new Comparator<Employee>() {   ///by anonymous inner class

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub

				int i = 0;

				if (e1.employeeSalary > e2.employeeSalary)
					i = 1;
				else if (e1.employeeSalary < e2.employeeSalary)
					i = -1;
				else
					i = 0;
				return i;
			}
		});

		System.out.println("List after sort SALARY" + obj);

		Collections.sort(obj, new SortByName());
		System.out.println("List after sort NAME" + obj);

	}

}
