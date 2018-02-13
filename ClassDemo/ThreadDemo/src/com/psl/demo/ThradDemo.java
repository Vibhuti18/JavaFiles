package com.psl.demo;

public class ThradDemo implements Runnable {

	@Override
	public synchronized void run() { // system callback methd wich gives cll to the system

		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			
			
			synchronized (this) {
				
			}
			
			
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Thread.currentThread().getName().equals("thread 1")) // gives
																		// the
																		// obj
																		// of
																		// current
																		// thread
			{
				/*
				 * System.out.println(" " + Thread      .currentThread().getPriority()
				 * + " " + Thread.currentThread().getName());
				 */

				System.out.println("thread 1 " + 3 * i);
			} else {
				
				
				if(i==9)
				{
					Thread t=new Thread(Thread.currentThread(),"thread 11");
					t.start();
				}
				/*
				 * System.out.println(" " + Thread.currentThread().getPriority()
				 * + " " + Thread.currentThread().getName());
				 */

				System.out.println("thread 2 " + 5 * i);
			}
		}
	}

	void print() {
		System.out.println("Thread 1 prints dis");
	}

	public static void main(String[] args) {

		System.out.println();
		ThradDemo td = new ThradDemo(); // td is the prcoess
		Thread t1 = new Thread(td, "thread 1"); // born state OR use method
												// t1.setname to name a thread
		Thread t2 = new Thread(td, "thread 2");
		/*
		 * t1.setPriority(1); t2.setPriority(10);
		 */
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		/*
		 * Thread t3 = new Thread(td); t3.setName("thread 1"); //set priority
		 * bfr the strt iof that thread t3.start();
		 */

		// print table of 3 on t1 and 5 on t2

	}

}
