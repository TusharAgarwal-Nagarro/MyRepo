package com.assessment.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.weather.model.WeatherInfo;
import com.assessment.weather.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService weatherService;
	
	@GetMapping("/history/{searchText}")
	public List<WeatherInfo> getWeatherData(@PathVariable String searchText) {
		
		return weatherService.getWeatherInfo(searchText);
		
	}
	
}
