package com.psl.question2;

public class RecurssiveThreads implements Runnable {
	static int i = 5;
	boolean b = true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (b) {
			

			Thread t = new Thread(Thread.currentThread(), Thread
					.currentThread().getName() + i);
			t.start();
		

			if (i == 1)
				{
				b=false;
				}
			else
				{	i--;
				System.out.println("Hello this is Thread" + i);
				}

		}

	}

	public static void main(String[] args) {

		RecurssiveThreads rt = new RecurssiveThreads();
		Thread t = new Thread(rt, "Thread" + i);
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

/*
 * while(i<=5) {
 * 
 * Thread t = new
 * Thread(Thread.currentThread(),Thread.currentThread().getName()+i); t.start();
 * i++;
 * 
 * //if(i==5)
 * System.out.println("Hello this is Thread"+Thread.currentThread().getName());
 * 
 * }
 */