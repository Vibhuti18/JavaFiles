package com.psl.question6;

public class Printer implements Runnable {

	Storage s;

	public Printer(Storage s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// System.out.println("Inside print"+getSclient().getCount());

		synchronized (s) {
			for (int i = 1; i <=10; i++) {
				while (s.isPrinted()) {
					try {
						s.wait();
					} catch (Exception e) {
					}
				}
				System.out.println(Thread.currentThread().getName() + " "
						+ s.getCount());
				s.setPrinted(true);
				s.notify();
			}
		}

	}

}