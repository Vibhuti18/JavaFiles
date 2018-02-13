package com.app.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="Office_no")
	private int hno;
	public Address() {
		
	}
	@Column(name="Office_locality")
	private String locality;
	@Column(name="state")
	private String state;
	@Column(name="pin")
	private long pin;
	public Address(int hno, String locality, String state, long pin) {
		this.hno = hno;
		this.locality = locality;
		this.state = state;
		this.pin = pin;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}

}
