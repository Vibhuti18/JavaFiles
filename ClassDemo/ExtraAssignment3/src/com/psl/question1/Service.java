package com.psl.question1;

public class Service {

	String serviceName;
	float sum = 0;
	int charges;

	public Service(String serviceName) {
		// TODO Auto-generated constructor stub

		this.serviceName = serviceName;

	}

	public void init(String serviceName) {
		switch (serviceName) {
		case "SMS":
			charges = 30;
			break;
		case "TALKTIME":
			charges = 30;
			break;
		case "2G":
			charges = 99;
			break;
		case "3G":
			charges = 199;
			break;
		case "4G":
			charges = 299;
			break;

		}

	}

}
