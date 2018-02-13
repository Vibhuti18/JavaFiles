package com.psl.question4;

import java.io.Serializable;

public class Employee extends Person implements Serializable{
	
	int Id;
	int employeeSalary;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


}
