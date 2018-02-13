package com.psl;

public class Ticket {
	private int ticketNumber;
	private int price;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Ticket(int ticketNumber, int price) {
		this.ticketNumber = ticketNumber;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", price=" + price
				+ "]";
	}

}
