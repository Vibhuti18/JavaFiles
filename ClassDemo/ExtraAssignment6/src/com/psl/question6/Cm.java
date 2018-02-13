package com.psl.question6;

import java.util.Comparator;

public class Cm implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		if(arg0.getEmployee_DOJ().before(arg1.getEmployee_DOJ()) )return -1;
		else return 1;
	}

}
