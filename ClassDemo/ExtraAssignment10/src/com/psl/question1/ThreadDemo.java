package com.psl.question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThreadDemo implements Runnable {

	String str[];

	public ThreadDemo(String str[]) {
		// TODO Auto-generated constructor stub
		this.str = str;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
			String s;
			while ((s = br.readLine()) != null) {

				if (Thread.currentThread().getName().equals("thread 1")) {
					if (s.contains(str[0]))
						System.out.println(Thread.currentThread().getName());
				}

				else if (Thread.currentThread().getName().equals("thread 2")) {
					if (s.contains(str[1]))
						System.out.println(Thread.currentThread().getName());
				}
				if (Thread.currentThread().getName().equals("thread 3")) {
					if (s.contains(str[2]))
						System.out.println(Thread.currentThread().getName());
				} else {
					if (s.contains(str[3]))
						System.out.println(Thread.currentThread().getName());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo(args);

		Thread t1 = new Thread(td, "thread 1");
		Thread t2 = new Thread(td, "thread 2");
		Thread t3 = new Thread(td, "thread 3");
		Thread t4 = new Thread(td, "thread 4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
