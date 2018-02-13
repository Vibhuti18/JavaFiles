package com.psl.question3;

import java.io.BufferedReader;
import java.io.FileReader;

public class FactorialClass implements Runnable {

	boolean isRead = true;
	String s;
	int p = 0;

	public int getfact(int p) {
		if (p == 0)
			return 1;
		else
			return p * getfact(p - 1);

	}

	@Override
	public void run() {

		// TODO Auto-generated method stub

		if (Thread.currentThread().getName().equals("thread 1")) {

			synchronized (this) {
				try (BufferedReader br = new BufferedReader(new FileReader(
						"number.txt"))) {
					while ((s = br.readLine()) != null) {
						while (!isRead) {
							wait();
						}
						p = Integer.parseInt(s);
						System.out.println("p = " + p);
						isRead = false;
						notify();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

		else {
			// System.out.println("hello");
			for (int j = 0; j < 5; j++) {
				synchronized (this) {
					while (isRead) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					System.out.println("Factorial of " + p + " is "
							+ getfact(p));
					isRead = true;
					notify();

				}
			}

		}

	}

	public static void main(String[] args) {
		FactorialClass fc = new FactorialClass();
		Thread t1 = new Thread(fc, "thread 1");
		Thread t2 = new Thread(fc, "thread 2");

		t1.start();
		t2.start();
	}

}
