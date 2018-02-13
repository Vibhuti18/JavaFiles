package com.psl.question1;

import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListProgram {
	Scanner s = new Scanner(System.in);
	ArrayList<String> listOfStudents = new ArrayList<String>();
	
	
	
	public void addStudents(int capacity)
	{
		String str;
		for(int i=0;i<capacity;i++)
		{
			str =s.next();
			listOfStudents.add(str);
		}
	}
	
	public void findStudent(int capacity)
	{
		String str;
		int flag=0;
		System.out.println("enter the name to be searched");
		str=s.next();
		for(int i=0;i<capacity;i++)
		{
			if(listOfStudents.equals(str))
				{
				flag=1;
				break;
				}
			
		}
		
		if(flag==1)
			System.out.println("found");
		else
			System.out.println("not found");
	}
	
	
	public static void main(String[] args) {
		
		int ip = 5;
		
		ArrayListProgram obj = new ArrayListProgram();
		obj.addStudents(ip);
		obj.findStudent(ip);
		
	}
	

}
