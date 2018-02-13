package com.psl.demo;

public class OuterClass {

	private int a = 10;

	static class InnerClass {

		// int b;

		public void display() {
			// TODO Auto-generated method stub

			System.out.println("Inner  display");

		}

	}

	/*
	 * private void display() { // TODO Auto-generated method stub class
	 * InnerClass1 {
	 * 
	 * // int b;
	 * 
	 * public void display() { // TODO Auto-generated method stub
	 * 
	 * System.out.println("Inner1  display");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * InnerClass1 i = new InnerClass1(); i.display();
	 * System.out.println("Outer Display");
	 * 
	 * }
	 */

	public void display() {

		System.out.println(" Outer class");

	}

	public static void main(String[] args) {
		/*
		 * OuterClass obj = new OuterClass(); obj.display();
		 * 
		 * OuterClass.InnerClass iobj = obj.new InnerClass(); // creating obj of
		 * // inner class
		 * 
		 * iobj.display();
		 */

		/*
		 * OuterClass.InnerClass iobj = new OuterClass.InnerClass();
		 * iobj.display(); OuterClass obj = new OuterClass(); obj.display();
		 */

		OuterClass obj = new OuterClass() { // overruide all thee methods of
											// Outer CLass

			// this is 1 invisible class wich extends above class
			@Override
			public void display() {
				// TODO Auto-generated method stub

				System.out.println("I am insidde anonymous class");
				// super.display();
			}
		};
		
		obj.display();
		
		MyInterface iobj = new MyInterface() {
			
			@Override
			public void Mymethod() {
				// TODO Auto-generated method stub
				
				
				System.out.println("Interface display");
				
			}
		};
		
		iobj.Mymethod();
		
		
		
	}

}
