package com.psl.question6;

public class Counter implements Runnable {
	Storage s;
	static int count=0;
	public Counter(Storage s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 synchronized(s) {
             for(int i = 1 ; i <= 10; i++){
                   while(!s.isPrinted()) {              //loop to take care of spontaneous wake-ups
                      try {
                         s.wait();
                      } catch(Exception e) {  }
                   }
                   s.setCount(i);
                   s.setPrinted(false);
                   s.notify();
             }
       }
	}


}
