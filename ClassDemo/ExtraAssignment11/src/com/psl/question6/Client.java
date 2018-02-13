package com.psl.question6;

public class Client {

	public static void main(String[] args) {

		Storage sclient = new Storage();
		Thread t = new Thread(new Counter(sclient), "Inc");
		Thread t1 = new Thread(new Printer(sclient), "Print");

		t.start();
		t1.start();

	}

}
