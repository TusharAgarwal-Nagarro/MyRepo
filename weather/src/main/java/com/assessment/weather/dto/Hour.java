
package com.assessment.weather.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time_epoch",
    "time",
    "temp_c",
    "temp_f",
    "is_day",
    "condition",
    "wind_mph",
    "wind_kph",
    "wind_degree",
    "wind_dir",
    "pressure_mb",
    "pressure_in",
    "precip_mm",
    "precip_in",
    "humidity",
    "cloud",
    "feelslike_c",
    "feelslike_f",
    "windchill_c",
    "windchill_f",
    "heatindex_c",
    "heatindex_f",
    "dewpoint_c",
    "dewpoint_f",
    "will_it_rain",
    "chance_of_rain",
    "will_it_snow",
    "chance_of_snow",
    "vis_km",
    "vis_miles",
    "gust_mph",
    "gust_kph"
})
public class Hour {

    @JsonProperty("time_epoch")
    private int timeEpoch;
    @JsonProperty("time")
    private String time;
    @JsonProperty("temp_c")
    private double tempC;
    @JsonProperty("temp_f")
    private double tempF;
    @JsonProperty("is_day")
    private int isDay;
    @JsonProperty("condition")
    private Condition condition;
    @JsonProperty("wind_mph")
    private double windMph;
    @JsonProperty("wind_kph")
    private double windKph;
    @JsonProperty("wind_degree")
    private int windDegree;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("pressure_mb")
    private double pressureMb;
    @JsonProperty("pressure_in")
    private double pressureIn;
    @JsonProperty("precip_mm")
    private double precipMm;
    @JsonProperty("precip_in")
    private double precipIn;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("cloud")
    private int cloud;
    @JsonProperty("feelslike_c")
    private double feelslikeC;
    @JsonProperty("feelslike_f")
    private double feelslikeF;
    @JsonProperty("windchill_c")
    private double windchillC;
    @JsonProperty("windchill_f")
    private double windchillF;
    @JsonProperty("heatindex_c")
    private double heatindexC;
    @JsonProperty("heatindex_f")
    private double heatindexF;
    @JsonProperty("dewpoint_c")
    private double dewpointC;
    @JsonProperty("dewpoint_f")
    private double dewpointF;
    @JsonProperty("will_it_rain")
    private int willItRain;
    @JsonProperty("chance_of_rain")
    private String chanceOfRain;
    @JsonProperty("will_it_snow")
    private int willItSnow;
    @JsonProperty("chance_of_snow")
    private String chanceOfSnow;
    @JsonProperty("vis_km")
    private double visKm;
    @JsonProperty("vis_miles")
    private double visMiles;
    @JsonProperty("gust_mph")
    private double gustMph;
    @JsonProperty("gust_kph")
    private double gustKph;

    @JsonProperty("time_epoch")
    public int getTimeEpoch() {
        return timeEpoch;
    }

    @JsonProperty("time_epoch")
    public void setTimeEpoch(int timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("temp_c")
    public double getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    @JsonProperty("temp_f")
    public double getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    @JsonProperty("is_day")
    public int getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @JsonProperty("wind_mph")
    public double getWindMph() {
        return windMph;
    }

    @JsonProperty("wind_mph")
    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    @JsonProperty("wind_kph")
    public double getWindKph() {
        return windKph;
    }

    @JsonProperty("wind_kph")
    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    @JsonProperty("wind_degree")
    public int getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("pressure_mb")
    public double getPressureMb() {
        return pressureMb;
    }

    @JsonProperty("pressure_mb")
    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    @JsonProperty("pressure_in")
    public double getPressureIn() {
        return pressureIn;
    }

    @JsonProperty("pressure_in")
    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    @JsonProperty("precip_mm")
    public double getPrecipMm() {
        return precipMm;
    }

    @JsonProperty("precip_mm")
    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    @JsonProperty("precip_in")
    public double getPrecipIn() {
        return precipIn;
    }

    @JsonProperty("precip_in")
    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("cloud")
    public int getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    @JsonProperty("feelslike_c")
    public double getFeelslikeC() {
        return feelslikeC;
    }

    @JsonProperty("feelslike_c")
    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    @JsonProperty("feelslike_f")
    public double getFeelslikeF() {
        return feelslikeF;
    }

    @JsonProperty("feelslike_f")
    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    @JsonProperty("windchill_c")
    public double getWindchillC() {
        return windchillC;
    }

    @JsonProperty("windchill_c")
    public void setWindchillC(double windchillC) {
        this.windchillC = windchillC;
    }

    @JsonProperty("windchill_f")
    public double getWindchillF() {
        return windchillF;
    }

    @JsonProperty("windchill_f")
    public void setWindchillF(double windchillF) {
        this.windchillF = windchillF;
    }

    @JsonProperty("heatindex_c")
    public double getHeatindexC() {
        return heatindexC;
    }

    @JsonProperty("heatindex_c")
    public void setHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
    }

    @JsonProperty("heatindex_f")
    public double getHeatindexF() {
        return heatindexF;
    }

    @JsonProperty("heatindex_f")
    public void setHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
    }

    @JsonProperty("dewpoint_c")
    public double getDewpointC() {
        return dewpointC;
    }

    @JsonProperty("dewpoint_c")
    public void setDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
    }

    @JsonProperty("dewpoint_f")
    public double getDewpointF() {
        return dewpointF;
    }

    @JsonProperty("dewpoint_f")
    public void setDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
    }

    @JsonProperty("will_it_rain")
    public int getWillItRain() {
        return willItRain;
    }

    @JsonProperty("will_it_rain")
    public void setWillItRain(int willItRain) {
        this.willItRain = willItRain;
    }

    @JsonProperty("chance_of_rain")
    public String getChanceOfRain() {
        return chanceOfRain;
    }

    @JsonProperty("chance_of_rain")
    public void setChanceOfRain(String chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    @JsonProperty("will_it_snow")
    public int getWillItSnow() {
        return willItSnow;
    }

    @JsonProperty("will_it_snow")
    public void setWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
    }

    @JsonProperty("chance_of_snow")
    public String getChanceOfSnow() {
        return chanceOfSnow;
    }

    @JsonProperty("chance_of_snow")
    public void setChanceOfSnow(String chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    @JsonProperty("vis_km")
    public double getVisKm() {
        return visKm;
    }

    @JsonProperty("vis_km")
    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    @JsonProperty("vis_miles")
    public double getVisMiles() {
        return visMiles;
    }

    @JsonProperty("vis_miles")
    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }

    @JsonProperty("gust_mph")
    public double getGustMph() {
        return gustMph;
    }

    @JsonProperty("gust_mph")
    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    @JsonProperty("gust_kph")
    public double getGustKph() {
        return gustKph;
    }

    @JsonProperty("gust_kph")
    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }

}
