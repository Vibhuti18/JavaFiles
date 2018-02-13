package com.psl.question3;

public class PriorityThreads implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals("one"))
			System.out.println(" "+Thread.currentThread().getName()+" priority "+Thread.currentThread().getPriority());
		else if(Thread.currentThread().getName().equals("two"))
			System.out.println(" "+Thread.currentThread().getName()+" priority "+Thread.currentThread().getPriority());
		else
			System.out.println(" "+Thread.currentThread().getName()+" priority "+Thread.currentThread().getPriority());


	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new PriorityThreads());
		t1.setPriority(4);
		Thread t2 = new Thread(new PriorityThreads(), "two");
		t2.setPriority(8);
		Thread t3 = new Thread(new PriorityThreads(), "three");
		t3.setPriority(2);
		
		//t1.start();
		t2.start();
		t3.start();
		
		t1.setName("My Thread");
		t1.start();
        System.out.println(Thread.currentThread().getName());
	}

}
