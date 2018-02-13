package com.psl.deserializable;

import java.io.Serializable;

public class Employee  implements Serializable {

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

	
	  @Override public int hashCode() { final int prime = 31; int result = 1;
	  result = prime * result + employeeId; result = prime * result +
	  ((employeeName == null) ? 0 : employeeName.hashCode()); result = prime *
	  result + employeeSalary; return result; }
	 

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

	// override comparable methods
	// comparable has got comparaTo method
	


}
