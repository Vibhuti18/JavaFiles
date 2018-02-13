package com.psl.demo;

public class GenericsDemo {

	private Object obj;

	public GenericsDemo(Object obj) {
		// TODO Auto-generated constructor stub

		this.obj = obj;

	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
	
	
	public static void main(String[] args) {
		
		
		GenericsDemo obj1 = new GenericsDemo(new String("Persistent"));
		GenericsDemo obj2 = new GenericsDemo(new Integer(10));
		
		//Object str = obj1.getObj();  //error coz it will return obj,but we need string  
		String str = (String) obj1.getObj();   //upcasting
		

		System.out.println(str);
		
		String str1 = (String)obj2.getObj();
		
		System.out.println(str1);
		
		
		
	}
	

}
