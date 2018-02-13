package com.psl.question6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintMethod {
	
	
	private static <T> void print(Collection<T> obj) {
		// TODO Auto-generated method stub
		
		for(T c1 : obj)
		{
			System.out.println(c1);
		}
		

	}
	
	public static void main(String[] args) {
		
		PrintMethod pt = new PrintMethod();
		
		Set <String> set = new HashSet<String>();
		set.add("Vibhuti");
		set.add("Pooja");
		set.add("Nidhi");
		set.add("Samrudhi");
		set.add("Annalisa");
		System.out.println("Set Contents");
		pt.print(set);
		
		
		List <String> list = new ArrayList<String>();
		list.add("Vibhuti");
		list.add("Pooja");
		list.add("Nidhi");
		list.add("Samrudhi");
		list.add("Annalisa");
		System.out.println("List Contents");
		pt.print(list);
		
		
	}

}
