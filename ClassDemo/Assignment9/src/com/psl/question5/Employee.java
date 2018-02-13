package com.psl.question5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Employee implements Comparable<Employee> {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + employeeSalary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		return true;
	}

	int employeeId;
	String employeeName;
	int employeeSalary;
	Date joiningDate;

	public Employee(int employeeId, String employeeName, int employeeSalary,
			Date joiningDate) {
		// TODO Auto-generated constructor stub

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.joiningDate = joiningDate;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);
		return "Employee employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary
				+ sdf.format(joiningDate);
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

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		if (employeeId < arg0.employeeId)
			return -1;
		else if (employeeId > arg0.employeeId)
			return 1;
		else
			return 0;
	}

}
