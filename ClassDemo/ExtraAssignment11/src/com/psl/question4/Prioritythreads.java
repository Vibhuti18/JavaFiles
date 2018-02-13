package com.psl.question4;

public class Prioritythreads implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals("one"))
		{
			
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" "+Thread.currentThread().getName()+" priority "+Thread.currentThread().getPriority());
		}
		else
			System.out.println(" "+Thread.currentThread().getName()+" priority "+Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new Prioritythreads(), "one");
		Thread t2 = new Thread(new Prioritythreads(), "two");

		t1.setPriority(10);
		t2.setPriority(1);

		t1.start();
		t2.start();
	}

}
