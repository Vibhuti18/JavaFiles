package com.psl.beans;

public class Transaction {
	private int tid;
	private int uid;
	private String action;
	private int amount;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", uid=" + uid + ", action="
				+ action + ", amount=" + amount + "]";
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
