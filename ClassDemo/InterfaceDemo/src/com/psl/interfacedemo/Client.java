package com.psl.interfacedemo;

import com.psl.employee.Developer;
import com.psl.vehicle.*;

public class Client {
	
	public static void main(String[] args) {
		
		
		Printable p = new Developer();
		AmirKhan a = new Developer();
		p.print();
		a.acting();
		
		p= new AudiR8();
		p.print();

		
	}

}
