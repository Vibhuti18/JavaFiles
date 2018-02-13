package com.psl.question2;

import java.util.Iterator;
import java.util.List;

public class LinkedList1 {
	
	List<Integer> list = new java.util.LinkedList<Integer>();
	private void addElements() {
		// TODO Auto-generated method stub
		int i=10;
		Integer i1 = new Integer(i);
		list.add(i1);
		list.add(11);
		list.add(12);
		list.add(13);
		
	}

	
	public void displayElements() {
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	public void addFirst() {
		
		list.add(0, 15);
		
	}
	
	
	public void deleteLastElement() {
		
			list.remove(list.size()-1);
		
		
		
	}
	
	public void retrieve() {
		
		
		for(int i=1;i<list.size();i++)
		System.out.println(list.get(i));
		
	}
	
	public static void main(String[] args) {
		
		LinkedList1 l = new LinkedList1();
		l.addElements();
		//l.displayElements();
		//l.addFirst();
		//l.deleteLastElement();
		//l.displayElements();
		l.retrieve();
	}



	
}
