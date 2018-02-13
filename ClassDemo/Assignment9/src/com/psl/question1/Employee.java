package com.psl.question1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	int employeeId;
	String employeeName;
	int employeeSalary;
	List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
	
	
	public Employee(int employeeId,String employeeName,int employeeSalary,List<Vehicle> listOfVehicles) {
		// TODO Auto-generated constructor stub
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.listOfVehicles = listOfVehicles;
	}
	public List<Vehicle> getListOfVehicles() {
		return listOfVehicles;
	}
	public void setListOfVehicles(List<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
