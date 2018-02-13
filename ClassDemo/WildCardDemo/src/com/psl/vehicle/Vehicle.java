package com.psl.vehicle;

public class Vehicle {

	public Vehicle() {
		// TODO Auto-generated constructor stub

		System.out.println("Vehicle Class");
	}

}

class FourWheeler extends Vehicle {
	public FourWheeler() {
		// TODO Auto-generated constructor stub

		System.out.println("four Wheeler");
	}
}

class TwoWheeler extends Vehicle {

	public TwoWheeler() {

		// TODO Auto-generated constructor stub

		System.out.println("two Wheeler");
	}
}

class AudiQ7 extends FourWheeler {
	public AudiQ7() {
		// TODO Auto-generated constructor stub
		System.out.println("Audi07");
	}
}