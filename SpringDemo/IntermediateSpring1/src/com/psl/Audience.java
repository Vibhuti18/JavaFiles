package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	
	@Pointcut(value="execution(* com.psl.Performer.perform(String,String)) && args(song,artist)")
	public void pc1(String song,String artist)
	{
		//dummy method just supporting the pointcut
	}
	
	@Before(value="pc1(song,artist)")
	public void takeSeats(String song,String artist) {
		System.out.println("Audience take seats for the song "+song+" originally sung by "+artist);
	}
	//@Before(value="pc1()")
	public void switchOffPhones() {
		// TODO Auto-generated method stub
System.out.println("audience Switch off Phones");
	}
	//@AfterThrowing(value="pc1()")
	public void demandAReturn() {
		// TODO Auto-generated method stub
System.out.println("Audience depands for refund");
	}
	
	//@AfterReturning(value="pc1()")
	public void applaud() {
		// TODO Auto-generated method stub
System.out.println("The audience applauds CLAP CLAP CLAP!!!!!");
	}
	//@After(value="pc1()")
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("The audience go home");

	}
	
	//@Around(value="pc1()")
	public void recordPerformance(ProceedingJoinPoint jp) {
		// TODO Auto-generated method stub
		
		//before
		System.out.println("Audience take seats");
		System.out.println("audience Switch off Phones");
		System.out.println("On the camera");
		
		//during
		try {
			System.out.println("Recording began");
			jp.proceed();
			System.out.println("The audience applauds CLAP CLAP CLAP!!!!!");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
	
			System.out.println("Audience depands for refund");
			e.printStackTrace();
		}
		
		
		
		//after
		System.out.println("Stop the recording");
		System.out.println("The audience go home");
		

	}

}
