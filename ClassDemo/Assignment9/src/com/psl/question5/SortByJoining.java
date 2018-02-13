package com.psl.question5;

import java.util.Comparator;

public class SortByJoining implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		
		int c = e1.getJoiningDate().compareTo(e2.getJoiningDate());
		if(c==-1)
			c=-1;
		else
			c=1;
		return c;
	}

}
