package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Transaction;
import com.psl.service.TransactionService;



public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		TransactionService s = context.getBean("service",TransactionService.class);
		Transaction e=context.getBean("transaction",Transaction.class);
		
		//s.deposit(e);
		s.withdraw(e);
		
		//s.createEmployee(e);
		//System.out.println("done");
		//s.updateEmployee(12, "Aditi");
		//System.out.println("done");
		
		//s.deleteemployee(12);
		//s.getAllTransactions(101);
		System.out.println("done");
		

	}


}
