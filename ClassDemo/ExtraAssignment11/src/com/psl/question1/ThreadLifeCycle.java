package com.psl.question1;

public class ThreadLifeCycle implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			double p = Math.random() * 2999;
			System.out.println((long)p);
			Thread.sleep((long)p);

			System.out.println(" " + Thread.currentThread().getName()
					+ " Sleep time is " + p);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ThreadLifeCycle tlc = new ThreadLifeCycle();

		Thread t = new Thread(tlc, "thread 1");
		Thread t1 = new Thread(tlc, "thread 2");
		t.start();
		t1.start();

	}

}
