package com.psl.question4;

import java.io.Serializable;

public class Student implements Serializable {

	private int rollNo;
	private String name;
	private int standard;
	private char grade;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public char getGrade() {
		return grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		result = prime * result + standard;
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
		Student other = (Student) obj;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name + ", standard=" + standard
				+ ", grade=" + grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}
