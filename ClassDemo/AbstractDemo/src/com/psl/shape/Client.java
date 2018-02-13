package com.psl.shape;

public class Client {

	public static void main(String[] args) {

		Shape s = new Circle(5.0f);
		s.calculateArea();
		s.display();
	}

}
