package com.psl.question4;

public class City{
	int cityId;
	String cityName;
	
	public int getCityId() {
		return cityId;
	}
	@Override
	public String toString() {
		return "City " + cityId + ", cityName=" + cityName ;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	

	


}
