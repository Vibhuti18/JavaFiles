package com.psl.greetings;

import esg.itp.shape.*;

public class ShapeImplementer {
	
	
	public static void main(String args[])
	{
		Square s= new Square(5.0f);
		Rectangle r = new Rectangle(10.0f,10.f);
		
		s.calcArea();
		s.calcPeri();
		s.display();
		
		r.calcArea();
		r.calcPeri();
		r.display();
	}

}
