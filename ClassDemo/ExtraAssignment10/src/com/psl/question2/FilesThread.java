package com.psl.question2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesThread implements Runnable {
	String s[];

	public FilesThread(String s[]) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread().getName().equals("thread 1")) {
			try (BufferedReader br = new BufferedReader(new FileReader(s[0]))) {
				Thread.sleep(100);
				String st;

				while ((st = br.readLine()) != null) {
					System.out.println(Thread.currentThread().getName());
					System.out.println(st);
				}
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try (BufferedReader br = new BufferedReader(new FileReader(s[1]))) {
				Thread.sleep(100);
				String st;

				while ((st = br.readLine()) != null) {
					System.out.println(Thread.currentThread().getName());
					System.out.println(st);
				}
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		FilesThread ft = new FilesThread(args);
		Thread t1 = new Thread(ft, "thread 1");
		Thread t2 = new Thread(ft, "thread 2");

		t1.start();
		t2.start();

	}

}
