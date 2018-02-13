package com.psl.vehicle;

public class Employee {

	int employeeSalary = 800000;
	int employeeId = 100;
	String employeeName = "Bond";
	
	public Employee() {
		// TODO Auto-generated constructor stub
		
		System.out.println("employee");
	}
	
	public Employee(int id,int salary,String name) {
		// TODO Auto-generated constructor stub
		
		employeeSalary = salary;
		employeeId = id;
		employeeName =name;
		
	}
	
	 void displayEmployee() {
		 System.out.println("Employee is:" + employeeId + employeeName
					+ employeeSalary);
		
	}

}
