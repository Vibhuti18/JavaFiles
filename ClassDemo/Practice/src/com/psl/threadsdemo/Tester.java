package com.psl.threadsdemo;

public class Tester implements Runnable{
	
	static PingPong2 pp = new PingPong2();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getId());
		pp.hit(Thread.currentThread().getId());
		
	}

	public static void main(String[] args) {
		
		new Thread(new Tester()).start();
		new Thread(new Tester()).start();
		
	}

}
