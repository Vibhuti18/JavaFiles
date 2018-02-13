package com.psl.question6;

public class Add {
	
	public int sum;
	
	public Add() {
		// TODO Auto-generated constructor stub
		sum=0;
	}
	
	
	public int add(int...a)
	{
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		
		Add a = new Add();
		
		System.out.println(" sum :"+a.add(1,2,3,4));
	}

}
