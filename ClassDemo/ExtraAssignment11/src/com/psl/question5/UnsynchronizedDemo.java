package com.psl.question5;


public class UnsynchronizedDemo implements Runnable {
	
	
	static class InnerCounter {

		int count;

		public InnerCounter() {
			// TODO Auto-generated constructor stub
			count = 0;
		}

		public void incrementCount() {
			count++;
		}

	}


	
 InnerCounter c = new InnerCounter();

	/*public void display() {
		System.out.println(" Count bfr increment " + c.count);
		c.incrementCount();
		System.out.println(" Count aftr increment " + c.count);

	}*/

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			c.incrementCount();
			if (Thread.currentThread().getName().equals("one")) {
				
				System.out.println(" " + Thread.currentThread().getName() + " "

				+ c.count);
			} else if (Thread.currentThread().getName().equals("two")) {
				//c.incrementCount();
				System.out.println(" " + Thread.currentThread().getName() + " "

				+ c.count);
			} else if (Thread.currentThread().getName().equals("three")) {
				//c.incrementCount();
				System.out.println(" " + Thread.currentThread().getName() + " "

				+ c.count);
			} else {
				//c.incrementCount();
				System.out.println(" " + Thread.currentThread().getName() + " "

				+ c.count);
			}

		}

	}

	public static void main(String[] args) {

		
		Thread t1 = new Thread(new UnsynchronizedDemo(), "one");
		Thread t2 = new Thread(new UnsynchronizedDemo(), "two");
		Thread t3 = new Thread(new UnsynchronizedDemo(), "three");
		Thread t4 = new Thread(new UnsynchronizedDemo(), "four");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start();
		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}



