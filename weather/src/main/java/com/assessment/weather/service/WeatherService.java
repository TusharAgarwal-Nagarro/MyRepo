package com.assessment.weather.service;

import java.util.List;

import com.assessment.weather.model.WeatherInfo;

public interface WeatherService {
	
	public List<WeatherInfo> getWeatherInfo(String searchText);

}
