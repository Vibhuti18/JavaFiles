package com.psl.collectiondemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;


public class CollectionDemo {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>(); // automatic type
															// reference on
															// right side

		obj.add("Prabhav"); // addall--one collection into anothr collection
		obj.add("Nishit");
		obj.add("Namrata");
		obj.add("Madhushree");
		obj.add("Lerisa");
		obj.add("Sruthi");
		obj.add("Prabhav");

		System.out.println(obj);

		System.out.println("At 2 " + obj.get(2));

		for (int i = 0; i < obj.size(); i++) {

			System.out.println(obj.get(i));

		}

		obj.remove("Prabhav");
		System.out.println(obj);

		for (String string : obj) { // enhanced version of for loop use when u
									// hv to traverse to fixed length limitation
									// is : cant put own logic(always increments
									// by one only) + cant get index
			System.out.println(string);
		}
		
		//traverse using iterators
		ListIterator<String> it =obj.listIterator();
		
		String str = null;
		
		while(it.hasNext()) //cannot modify collection obj while iterating
		{
			str = it.next();
			if(str.equals("Prabhav")) it.remove();
				//it.remove();
		/*	System.out.println(str);
			if(str.equals("Prabhav"))
			obj.remove("Prabhav");*/
			
		}

		System.out.println(obj);
		
		
		
		Employee e1 = new Employee(10, 200000, "Flash");
		Employee e2 = new Employee(5, 300000, "Arrow");
		Employee e3 = new Employee(16, 400000, "Joeey");
		Employee e4 = new Employee(5, 300000, "Arrow");    //duplicate
		

		Set<Employee> obj1 = new HashSet<Employee>();
		
		obj1.add(e1);
		obj1.add(e2);
		obj1.add(e3);
		obj1.add(e4);
		
		System.out.println(obj1);
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e4));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
			
			
	}

}
