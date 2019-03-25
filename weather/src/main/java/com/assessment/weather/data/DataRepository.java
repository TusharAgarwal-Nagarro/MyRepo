package com.assessment.weather.data;

import com.assessment.weather.dto.Result;

public interface DataRepository {

	Result getWeatherHistoryData (String searchText,String date);
}
