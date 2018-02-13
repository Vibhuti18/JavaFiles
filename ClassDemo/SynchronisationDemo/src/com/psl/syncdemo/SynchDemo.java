package com.psl.syncdemo;

public class SynchDemo implements Runnable {
	Account ac = new Account(100000);

	public SynchDemo(Account a) {
		// TODO Auto-generated constructor stub

		ac = a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().getName().equals("one")) {
				synchronized (ac) {
					//deposit(10000);
					ac.balance+=10000;
					//ac.setBalance(fbal);
					System.out.println("After deposit" + ac.getBalance());
					

				}
			} else {

				ac.balance-=10000;
				//ac.setBalance(f);
				System.out.println("After withdraw" + ac.getBalance());
				//withdraw(10000);

			}

		}

	}

	private void withdraw(int i) {
		// TODO Auto-generated method stub
		int f = ac.getBalance() - i;
		ac.setBalance(f);
		System.out.println("After withdraw" + ac.getBalance());
	}

	private void deposit(int i) {
		// TODO Auto-generated method stub

		int fbal = ac.getBalance() + i;
		ac.setBalance(fbal);
		System.out.println("After deposit" + ac.getBalance());

	}

	public static void main(String[] args) {

		SynchDemo syc = new SynchDemo(new Account());
		Thread t1 = new Thread(syc, "one");
		Thread t2 = new Thread(syc, "two");

		t1.start();
		t2.start();

	}

}
