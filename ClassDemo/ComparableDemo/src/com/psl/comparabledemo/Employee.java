package com.psl.comparabledemo;

public class Employee implements Comparable<Employee> {

	int employeeSalary = 800000;
	int employeeId = 100;
	String employeeName = "Bond";

	public Employee(int id, int salary, String name) {
		// TODO Auto-generated constructor stub

		employeeSalary = salary;
		employeeId = id;
		employeeName = name;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee is:" + employeeId + employeeName + employeeSalary;
	}

	// override comparable methods
	// comparable has got comparaTo method

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.employeeId > o.employeeId)
			return 1;
		else if (this.employeeId < o.employeeId)
			return -1;
		else
			return 0;
	}

}
