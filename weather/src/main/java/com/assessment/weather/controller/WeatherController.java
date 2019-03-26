package com.assessment.weather.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	
	@ExceptionHandler(IllegalArgumentException.class)
	void handleBadRequests(HttpServletResponse response) throws IOException {
	    response.sendError(HttpStatus.BAD_REQUEST.value(), "Please try again and with a non empty string as US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name");
	}
	
}
