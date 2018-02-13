package com.psl.question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
	
	
	List<City> list = new ArrayList<City>();
	
	public void addCities() {
		
		City c = new City();
		c.setCityId(101);
		c.setCityName("Margao");
		c.setCityInfo("A commercial city in goa");
		list.add(c);
		c=new City();
		c.setCityId(102);
		c.setCityName("Pune");
		c.setCityInfo("IT hub of maharashtra");
		list.add(c);
		
	}
	
	public void displayCities() {
		
		System.out.println("Method 1 : Using foreach loop");
		for (City city : list) {
			System.out.println(city);
		}
		
		System.out.println("Method 2 : Using iterator");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public static void main(String[] args) {
		
		Client c = new Client();
		c.addCities();
		c.displayCities();
		
	}

}
