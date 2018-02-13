package com.psl.question1;

public class CustomerBill {
	
	String CustomerName; 		
	String travelMonth;			
	double package1;		
	double food;
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getTravelMonth() {
		return travelMonth;
	}
	public void setTravelMonth(String travelMonth) {
		this.travelMonth = travelMonth;
	}
	public double getPackage1() {
		return package1;
	}
	public void setPackage1(double package1) {
		this.package1 = package1;
	}
	public double getFood() {
		return food;
	}
	public void setFood(double food) {
		this.food = food;
	}			


}
