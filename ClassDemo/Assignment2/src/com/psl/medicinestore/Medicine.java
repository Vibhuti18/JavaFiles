package com.psl.medicinestore;

public class Medicine {
	
	private String name,address;
	
	public Medicine(String name,String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		
	}
	
	public void displayLabel()
	{
		System.out.println(" Name : "+name+"address : "+address);
	}
	

}
