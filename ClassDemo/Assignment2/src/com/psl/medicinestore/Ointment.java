package com.psl.medicinestore;

public class Ointment extends Medicine{
	
	public Ointment(String name,String add) {
		// TODO Auto-generated constructor stub
		super(name,add);
		
	}
	
@Override
public void displayLabel() {
	// TODO Auto-generated method stub
	super.displayLabel();
	System.out.println("for external use only");
	
}

}
