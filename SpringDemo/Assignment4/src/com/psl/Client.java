package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Shopping p = (Shopping) context.getBean("shopping");
		//startTime=System.currentTimeMillis();
		p.browses();
		p.SelectsProduct();
		p.addtocart();
		

	}

}
