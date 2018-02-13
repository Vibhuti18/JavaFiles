package com.psl.enumdemo;

public enum Coffee {
	
	small(50),regular(80),large(120);
	
	int price;
	private Coffee(int p) {
		// TODO Auto-generated constructor stub
		price=p;
	}
	
	public int getPrice() {
		return price;
	}

}
