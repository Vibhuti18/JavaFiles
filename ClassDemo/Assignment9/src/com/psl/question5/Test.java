package com.psl.question5;
import java.util.*; 
public class Test{ 
public static void main(String[] args) { 
Set<String> h = new HashSet<String>(); 
h.add("One"); 
h.add("Two"); 
h.add("Three"); 
h.add("Four"); 
h.add("One"); 
h.add("Four"); 
List<String> l = new ArrayList<String>(); 
l.add("One"); 
l.add("Two"); 
l.add("Three"); 
h.retainAll(l); 
System.out.println("Size:" + l.size() + h.size()); 
} 
}