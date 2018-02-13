package com.psl.collectiondemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	
	public static void main(String[] args) {
		Set<String> obj = new LinkedHashSet<String>();

		

		obj.add("Prabhav");
		obj.add("Nishit");
		obj.add("Namrata");
		obj.add("Madhushree");
		obj.add("Lerisa");
		obj.add("Sruthi");
		obj.add("Prabhav");

		System.out.println(obj);
		
		Iterator<String> it =obj.iterator();
		
		String str = null;
		
		
		while(it.hasNext()) //cannot modify collection obj while iterating
		{
			str = it.next();
			if(str.equals("Prabhav"))
				it.remove();
		/*	System.out.println(str);
			if(str.equals("Prabhav"))
			obj.remove("Prabhav");*/
			
		}



		
		

		
	}
	
	

}
