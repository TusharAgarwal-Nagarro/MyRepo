package com.assessment.weather;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.assessment.weather.data.DataRepository;
import com.assessment.weather.dto.Result;
import com.assessment.weather.model.WeatherInfo;
import com.assessment.weather.service.WeatherService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.minidev.json.parser.ParseException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherServiceUnitTest {

	@Autowired
	private WeatherService weatherService;
	
	 @MockBean
	    private DataRepository dataRepo ;
	 
	 @SuppressWarnings("deprecation")
	@Test
	 public void testGetWeatherData() throws ParseException, JsonParseException, JsonMappingException, IOException {
		 ObjectMapper mapper = new ObjectMapper();
		Result res = mapper.readValue(new File("D:\\weather\\src\\test\\java\\com\\assessment\\weather\\sample.json"), Result.class);
		Mockito.when(dataRepo.getWeatherHistoryData(Mockito.anyString(), Mockito.anyString())).thenReturn(res);
		
		List<WeatherInfo> list = weatherService.getWeatherInfo("delhi");
		
		Assert.isTrue(list.get(0).getHumidity()==31);
		
		
	 }
}
