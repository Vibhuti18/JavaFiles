package com.psl.question4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	
	static List<Employee> listOfEmployees = new ArrayList<Employee>();
	public static void main(String[] args) {
		
		Employee p= new Employee();
		Date d=null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		try {
			d=new Date();
			p.setName("Vibhuti");
			p.setAddress("Margao");
			p.setDateOfBirth(sdf.parse("18/12/1985"));
			p.setId(101);
			p.setEmployeeSalary(600000);
			listOfEmployees.add(p);
			
			d=new Date();
			p.setName("Pooja");
			p.setAddress("Ponda");
			p.setDateOfBirth(sdf.parse("19/02/1986"));
			p.setId(102);
			p.setEmployeeSalary(600550);
			listOfEmployees.add(p);
			
			d=new Date();
			p.setName("Sampat");
			p.setAddress("Vasco");
			p.setDateOfBirth(sdf.parse("20/03/1965"));
			p.setId(103);
			p.setEmployeeSalary(605560);
			listOfEmployees.add(p);
			
			d=new Date();
			p.setName("Nidhi");
			p.setAddress("Panjim");
			p.setDateOfBirth(sdf.parse("11/05/1992"));
			p.setId(104);
			p.setEmployeeSalary(7856654);
			listOfEmployees.add(p);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
