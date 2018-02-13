package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Person p = context.getBean("person",Person.class);
		//p.setAge(25);
		System.out.println(p);
		
	}

}
