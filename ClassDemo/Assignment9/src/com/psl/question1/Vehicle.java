package com.psl.question1;

public class Vehicle {
	
	String vehicleType;
	String vehicleName;
	
	public Vehicle(String vehicleType,String vehicleName) {
		// TODO Auto-generated constructor stub
		
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	

}
