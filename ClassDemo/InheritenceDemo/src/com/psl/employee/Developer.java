package com.psl.employee;

public class Developer extends Employee {

	int pf = 5000;
	int ta = 10000;
	int hra = 20000;
	
	public Developer(int id,int salary,String name,int pf,int ta) {
		// TODO Auto-generated constructor stub
		super(id,salary,name);
		
		this.pf=pf;
		this.ta = ta;
		
		
	}

	void displayDeveloper() {
		// TODO Auto-generated method stub
		int netSalary = employeeSalary + ta + pf + hra;

		System.out.println("Developer is:" + employeeId + employeeName
				+ netSalary);
	}

}
