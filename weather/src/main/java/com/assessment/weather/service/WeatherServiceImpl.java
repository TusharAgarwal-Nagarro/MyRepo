package com.assessment.weather.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		List<WeatherInfo> weatherInfo = new ArrayList<>();
		try{
			for(int i = 1 ;i<=5;i++) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.DATE, -i);
				Result result = dataRepository.getWeatherHistoryData(searchText, dateFormat.format(cal.getTime()));
				
				Optional<Hour> hr = result.getForecast().getForecastday().stream().map(day->day.getHour().get(0)).findFirst();
				
				if(hr.isPresent()){
					Hour hour = hr.get();
					weatherInfo.add(new WeatherInfo(hour.getWindDir(), hour.getPressureIn(), hour.getPrecipIn(), hour.getHumidity(), hour.getCloud(),result.getForecast().getForecastday().get(0).getDate()));
				}
			}
			return weatherInfo;
		}
		catch(Exception e) {
			throw e;
		}
	}
}
