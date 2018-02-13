package com.psl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	@Value(value="ABC rd")
	private String street;
	@Value(value="Margao")
	private String city;
	@Value(value="403605")
	private String zip;
	
	public Address(String street, String city, String zip) {
		//System.out.println("In param3 Address constructor");
		
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
	public Address() {
		// TODO Auto-generated constructor stub
		//System.out.println("In default address constructor");
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zip=" + zip
				+ "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		//System.out.println("In Adress.setStreet ");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		//System.out.println("In Adress.setCity ");
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
	//	System.out.println("In Adress.setZip ");
		this.zip = zip;
	}
	public Address(String street, String city) {
		//System.out.println("In param2 Address constructor");
		this.street = street;
		this.city = city;
	}
	
	
	public void abc() {
		System.out.println("Addr init ");
	}
	
	public void pqr() {
		System.out.println("Addr destroy");
		
	}

}
