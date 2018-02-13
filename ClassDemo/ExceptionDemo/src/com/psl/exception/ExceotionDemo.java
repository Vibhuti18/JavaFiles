package com.psl.exception;

/*
 * Run time demo
 */


public class ExceotionDemo {
	
	public void display()
	{
		System.out.println("Display");
	}

	public static void main(String[] args) {
		int result, a, b;
		a = 10;
		b = 0;
		try{
			result = a / b;
			System.out.println("result is :"+result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hey..you cannot divide by zero");
			b=2;
			result = a/b;
			System.out.println("result is :"+result);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("All not good !");
			
		}
		
		System.out.println("All looks good !");
	}

}
