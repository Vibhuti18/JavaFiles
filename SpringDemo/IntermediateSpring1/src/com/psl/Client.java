package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Performer p = (Performer) context.getBean("performer");
		p.perform("Tum Hi Ho","Arijit Singh");
	}

}
