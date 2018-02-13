package com.psl.demo;

public class WithGenerics <T> {
	

	private T obj;    

	public WithGenerics(T obj) {       //T is replaced wit oject at run time So at run time T will 1st b replced by String and Than by Integer
		// TODO Auto-generated constructor stub

		this.obj = obj;

	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	
	public static void main(String[] args) {
		
		
		WithGenerics<String> obj1 = new WithGenerics<String>(("Persistent"));
		WithGenerics<Integer> obj2 = new WithGenerics<Integer>((10));
		
		//Object str = obj1.getObj();  //error coz it will return obj,but we need string  
		String str = (String) obj1.getObj();   //upcasting
		//will never get classcaseexp if v use generics
		
		System.out.println(str);
		
		Integer str1 = obj2.getObj();
		
		System.out.println(str1);
		
		
	}

}
