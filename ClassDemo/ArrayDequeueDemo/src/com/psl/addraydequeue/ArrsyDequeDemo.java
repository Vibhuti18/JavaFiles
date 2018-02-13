package com.psl.addraydequeue;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrsyDequeDemo {

	
	public static void main(String[] args) {
		List<Integer> deque = new ArrayList<Integer>();
		
		deque.add(40);
		deque.add(50);
		deque.add(60);
		deque.add(70);
		deque.add(20);
		deque.add(10);
		
		
		Iterator<Integer> it = deque.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}
}
