package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Helper {
	long st,et;
	@Pointcut(value="execution(* com.psl.Shopping.browses(..))")
	public void pc0() {
		// TODO Auto-generated method stub

	}
	
	

	@Pointcut(value="execution(* com.psl.Shopping.SelectsProduct(..))")
	public void pc1() {
		// TODO Auto-generated method stub

	}
	
	@Pointcut(value="execution(* com.psl.Shopping.addtocart(..))")
	public void pc2() {
		// TODO Auto-generated method stub

	}
	public void suggestions() {
		// TODO Auto-generated method stub
		System.out.println("Here are few suggestions : rugs \t tablecover");
	}
	
	//@After(value="pc2()")
	public void addCoupons() {
		// TODO Auto-generated method stub
System.out.println("The coupons are successfully added to your account..HAPPY SHOPPING");
	}
	
	//@After(value="pc2()")
	public void closeTheSite() {
		// TODO Auto-generated method stub
		System.out.println("You have been on dis site for "+Math.abs(st-et)+"seconds");
System.out.println("Thank You!! Visit again");
	}
	
	@Around(value="pc0()")
	public void ShoppingSession0(ProceedingJoinPoint jp) {
		// TODO Auto-generated method stub
		st=System.currentTimeMillis();
		
		try {
			jp.proceed();
			//suggestions();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Around(value="pc1()")
	public void ShoppingSession(ProceedingJoinPoint jp) {
		// TODO Auto-generated method stub
		try {
			jp.proceed();
			suggestions();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Around(value="pc2()")
	public void ShoppingSession2(ProceedingJoinPoint jp) {
		// TODO Auto-generated method stub
		try {
			jp.proceed();
			addCoupons();
			et=System.currentTimeMillis();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeTheSite();

	}
	
	
}
