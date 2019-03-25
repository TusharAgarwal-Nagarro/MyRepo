package com.assessment.weather.model;

public class WeatherInfo {
	
	private String windDirection;
	
	private double pressure;
	
	private double precip;
	
	private int humidity;
	
	private int cloud;
	
	private String currentDate;
	
	public WeatherInfo(String windDirection, double d, double e, int humidity, int cloud, String currentDate) {
		super();
		this.windDirection = windDirection;
		this.pressure = d;
		this.precip = e;
		this.humidity = humidity;
		this.cloud = cloud;
		this.currentDate = currentDate;
	}

	

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getPrecip() {
		return precip;
	}

	public void setPrecip(double precip) {
		this.precip = precip;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getCloud() {
		return cloud;
	}

	public void setCloud(int cloud) {
		this.cloud = cloud;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	

}
