package com.psl.beans;

public class Donor {
	
	private String username;
	private String password;
	private int age;
	private String bg;
	
	
	public Donor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Donor [username=" + username + ", password=" + password
				+ ", age=" + age + ", bg=" + bg + "]";
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBg() {
		return bg;
	}
	public void setBg(String bg) {
		this.bg = bg;
	}

}
