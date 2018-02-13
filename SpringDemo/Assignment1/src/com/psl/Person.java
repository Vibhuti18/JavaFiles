package com.psl;

public class Person {
	private String name;
	private  int age;
	private String source;
	private String destination;
	private Ticket ticket;
	private Status st;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Status getSt() {
		return st;
	}

	public void setSt(Status st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", source=" + source
				+ ", destination=" + destination + ", ticket=" + ticket
				+ ", st=" + st + "]";
	}
	
	
	

}
