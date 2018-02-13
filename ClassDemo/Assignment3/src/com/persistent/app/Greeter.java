package com.persistent.app;

public class Greeter extends Advisor {

	public String name;

	public Greeter(String aname) {
		// TODO Auto-generated constructor stub

		super();

		this.name = aname;
	}

	public void sayHello() {
		System.out.println("Hello" + name);
	}

	public void sayGoodBye() {
		System.out.println("GoodBye" + name);
	}

}
