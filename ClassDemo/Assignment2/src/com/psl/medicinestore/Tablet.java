package com.psl.medicinestore;

public class Tablet extends Medicine{
	
	public Tablet(String name,String add) {
		// TODO Auto-generated constructor stub
		super(name,add);
		
	}
	
	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
System.out.println("store in a cool dry place");
	}

}
