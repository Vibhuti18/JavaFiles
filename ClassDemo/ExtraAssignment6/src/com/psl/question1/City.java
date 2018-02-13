package com.psl.question1;

public class City {
	int cityId;
	String cityName;
	String cityInfo;
	public int getCityId() {
		return cityId;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName
				+ ", cityInfo=" + cityInfo + "]";
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
	public String getCityInfo() {
		return cityInfo;
	}
	public void setCityInfo(String cityInfo) {
		this.cityInfo = cityInfo;
	}
	
	


}
