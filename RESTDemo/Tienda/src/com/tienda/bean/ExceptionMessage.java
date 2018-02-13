package com.tienda.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="exception-msg")
public class ExceptionMessage {
	private String message;

	public ExceptionMessage() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ExceptionMessage(String message) {
		super();
		this.message = message;
	}
	

}
