package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Ticketcollector {
	
	@Pointcut(value="execution(* com.psl.Train.runs(..))")
	public void pc1() {
		// TODO Auto-generated method stub

	}

	//@Before(value="pc1()")
	public void printingPassengerList() {
		// TODO Auto-generated method stub
		System.out.println("The ticket Collector prints the passenger list");

	}
	public void checkingTickets() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("the TC checks for tickets");
		throw new Exception("Defaulter Found");
		
	}
@Around(value="pc1()")

private void journey(ProceedingJoinPoint jp) {
	printingPassengerList();
	
	try {
		jp.proceed();
		try {
			checkingTickets();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			collectingfine();
		}
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("destination reached");
	// TODO Auto-generated method stub

}

	public void collectingfine() {
		System.out.println("the ticket collector collects fine");
	}

}
