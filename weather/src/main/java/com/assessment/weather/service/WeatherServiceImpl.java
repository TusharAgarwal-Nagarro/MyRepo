package com.assessment.weather.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.weather.data.DataRepository;
import com.assessment.weather.dto.Hour;
import com.assessment.weather.dto.Result;
import com.assessment.weather.model.WeatherInfo;

@Service
public class WeatherServiceImpl implements WeatherService {
	
	@Autowired
	DataRepository dataRepository;
	
	@Override
	public List<WeatherInfo> getWeatherInfo(String searchText) {
		
		Result result = dataRepository.getWeatherHistoryData(searchText, "2019-03-20");
		
		List<WeatherInfo> weatherInfo = new ArrayList<>();

		Optional<Hour> hr = result.getForecast().getForecastday().stream().map(day->day.getHour().get(0)).findFirst();
		
		if(hr.isPresent()){
			Hour hour = hr.get();
			weatherInfo.add(new WeatherInfo(hour.getWindDir(), hour.getPressureIn(), hour.getPrecipIn(), hour.getHumidity(), hour.getCloud(),result.getForecast().getForecastday().get(0).getDate()));
		}
		return weatherInfo;
	}
	
	

}
