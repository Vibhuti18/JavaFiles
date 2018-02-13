package com.app.model;

import java.io.Serializable;

public class Magzines extends Books implements Serializable {
	
	private int volume;
	private int issueNo;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getIssueNo() {
		return issueNo;
	}
	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}
	

}
