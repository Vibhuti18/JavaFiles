package com.psl.medicinestore;

public class Syrup extends Medicine{
	
	public Syrup(String name,String add) {
		// TODO Auto-generated constructor stub
		super(name,add);
		
	}
	
	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
		System.out.println("Keep away from sunlight");
		
	}

}
