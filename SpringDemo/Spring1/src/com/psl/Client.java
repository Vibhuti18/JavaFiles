package com.psl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		Employee e=(Employee)context.getBean("emp");
		System.out.println(e.toString());
		
		context.registerShutdownHook();
	}

}
