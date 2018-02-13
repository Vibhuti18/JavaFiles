package com.psl.question6;

import java.util.Date;

public class Employee {

	@Override
	public String toString() {
		return "employee_ID=" + employee_ID + ", employee_Name="
				+ employee_Name + ", employee_Telephone=" + employee_Telephone
				+ ", employee_DOJ=" + employee_DOJ + ", d=" + d.day+d.month+d.year;
	}

	int employee_ID;
	String employee_Name;
	long employee_Telephone;
	Date employee_DOJ=null;
	DOB d;

	public int getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}

	public String getEmployee_Name() {
		return employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	public long getEmployee_Telephone() {
		return employee_Telephone;
	}

	public void setEmployee_Telephone(long employee_Telephone) {
		this.employee_Telephone = employee_Telephone;
	}

	public Date getEmployee_DOJ() {
		return employee_DOJ;
	}

	public void setEmployee_DOJ(Date employee_DOJ) {
		this.employee_DOJ = employee_DOJ;
	}

	

}

class DOB {
	int day;
	String month;
	int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
