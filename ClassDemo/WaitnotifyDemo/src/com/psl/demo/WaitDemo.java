package com.psl.demo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class WaitDemo extends JFrame implements Runnable {

	int gx = 10, rx = 10, bx = 10;

	public WaitDemo() {
		// TODO Auto-generated constructor stub

		setSize(800, 600); // pixel dimensions
		setVisible(true);
		setTitle("Let's Race...!!! OR STAY HOME...!!!");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		// for (int i = gx; i < 300; i++) {

		try {
			while (true) {
				if (Thread.currentThread().getName().equals("green")) {

					gx++;

					Thread.sleep(100);
					
					if(gx==400)
						synchronized (this) {
							wait();
							
						}

				} else if (Thread.currentThread().getName().equals("red")) {

					rx++;
					Thread.sleep(20);
					
					if(rx==400)
						synchronized (this) {
							wait();
							
						}
					

				} else {
					bx++;

					Thread.sleep(120);
					if(bx==400)
						synchronized (this) {
							notifyAll();
							
						}

				}
				repaint();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillOval(gx, 150, 50, 50);

		g.setColor(Color.RED);
		g.fillOval(rx, 250, 50, 50);

		g.setColor(Color.BLUE);
		g.fillOval(bx, 350, 50, 50);

	}


	public static void main(String[] args) {

		WaitDemo obj = new WaitDemo();
		Thread t1 = new Thread(obj, "green");
		Thread t2 = new Thread(obj, "red");
		Thread t3 = new Thread(obj, "blue");

		t1.start();
		t2.start();
		t3.start();

	}

}
