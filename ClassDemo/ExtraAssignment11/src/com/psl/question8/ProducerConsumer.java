package com.psl.question8;

import java.util.LinkedList;

public class ProducerConsumer implements Runnable {
	int count = 0;
	boolean isProduced = true;
	LinkedList<Integer> list = new LinkedList<Integer>();

	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (this) {
			for (int i = 0; i < 10; i++) {

				if (Thread.currentThread().getName().equals("T1")) {

					while (!isProduced) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					count = count + 1;
					list.add(count);
					System.out.println("added" + list);
					isProduced = false;
					notify();
		

				} else {


					while (isProduced) {

						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					// System.out.println("Notified producer");
					list.removeFirst();

					System.out.println("Element consumed:  " + count);

					isProduced = true;

					notify();

				}
			}
		}

	}

	public static void main(String[] args) {

		ProducerConsumer p = new ProducerConsumer();

		Thread t1 = new Thread(p, "T1");
		Thread t2 = new Thread(p, "T2");

		t1.start();
		t2.start();

	}

}
