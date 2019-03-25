package com.assessment.weather.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.assessment.weather.dto.Result;

@Repository
public class DataRepositoryImpl implements DataRepository {
	
	@Autowired
	RestTemplate restTemplate;


	@Override
	public Result getWeatherHistoryData(String searchText, String date) {
		
		String url = "http://api.apixu.com/v1/history.json?key=7ff7c8c3072b44d6a3e80010192503&q="+searchText+"&dt="+date;
		return restTemplate.getForObject(url,Result.class);
	}

}
