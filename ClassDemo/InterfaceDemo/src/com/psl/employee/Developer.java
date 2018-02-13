package com.psl.employee;

import com.psl.interfacedemo.AmirKhan;
import com.psl.interfacedemo.Printable;

public class Developer implements Printable,AmirKhan {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Developer Print");
	}
	
	@Override
	public void acting() {
		// TODO Auto-generated method stub
		
		System.out.println("Developer Acting");
		
	}

}
