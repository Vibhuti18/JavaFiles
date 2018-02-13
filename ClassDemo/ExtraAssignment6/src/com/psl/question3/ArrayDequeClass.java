package com.psl.question3;

import java.util.ArrayDeque;
import java.util.Deque;

import com.psl.question1.City;

public class ArrayDequeClass {
	
	Deque<City> d = new ArrayDeque<City>();
	
	public void addElements() {
		City c = new City();
		c.setCityId(101);
		c.setCityName("Margao");
		c.setCityInfo("A commercial city in goa");
		d.add(c);
		c=new City();
		c.setCityId(102);
		c.setCityName("Pune");
		c.setCityInfo("IT hub of maharashtra");
		d.add(c);
		c=null;
		d.add(c);
	}
	
	public void printFirst() {
		
		System.out.println(d.getFirst());
		
	}
	
	public void retrieveAndRemoveLast()
	{
		System.out.println("Last element is");
		System.out.println(d.getLast());
		d.removeLast();
		System.out.println("Deleted last element");
	}
	
	public static void main(String[] args) {
		
		ArrayDequeClass adc = new ArrayDequeClass();
		adc.addElements();
		adc.printFirst();
		adc.retrieveAndRemoveLast();
	}

}
