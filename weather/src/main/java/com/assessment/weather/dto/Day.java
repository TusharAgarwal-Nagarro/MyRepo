package com.assessment.weather.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxtemp_c",
    "maxtemp_f",
    "mintemp_c",
    "mintemp_f",
    "avgtemp_c",
    "avgtemp_f",
    "maxwind_mph",
    "maxwind_kph",
    "totalprecip_mm",
    "totalprecip_in",
    "avgvis_km",
    "avgvis_miles",
    "avghumidity",
    "condition",
    "uv"
})
public class Day {

    @JsonProperty("maxtemp_c")
    private double maxtempC;
    @JsonProperty("maxtemp_f")
    private double maxtempF;
    @JsonProperty("mintemp_c")
    private double mintempC;
    @JsonProperty("mintemp_f")
    private double mintempF;
    @JsonProperty("avgtemp_c")
    private double avgtempC;
    @JsonProperty("avgtemp_f")
    private double avgtempF;
    @JsonProperty("maxwind_mph")
    private double maxwindMph;
    @JsonProperty("maxwind_kph")
    private double maxwindKph;
    @JsonProperty("totalprecip_mm")
    private double totalprecipMm;
    @JsonProperty("totalprecip_in")
    private double totalprecipIn;
    @JsonProperty("avgvis_km")
    private double avgvisKm;
    @JsonProperty("avgvis_miles")
    private double avgvisMiles;
    @JsonProperty("avghumidity")
    private double avghumidity;
    @JsonProperty("condition")
    private Condition condition;
    @JsonProperty("uv")
    private double uv;

    @JsonProperty("maxtemp_c")
    public double getMaxtempC() {
        return maxtempC;
    }

    @JsonProperty("maxtemp_c")
    public void setMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
    }

    @JsonProperty("maxtemp_f")
    public double getMaxtempF() {
        return maxtempF;
    }

    @JsonProperty("maxtemp_f")
    public void setMaxtempF(double maxtempF) {
        this.maxtempF = maxtempF;
    }

    @JsonProperty("mintemp_c")
    public double getMintempC() {
        return mintempC;
    }

    @JsonProperty("mintemp_c")
    public void setMintempC(double mintempC) {
        this.mintempC = mintempC;
    }

    @JsonProperty("mintemp_f")
    public double getMintempF() {
        return mintempF;
    }

    @JsonProperty("mintemp_f")
    public void setMintempF(double mintempF) {
        this.mintempF = mintempF;
    }

    @JsonProperty("avgtemp_c")
    public double getAvgtempC() {
        return avgtempC;
    }

    @JsonProperty("avgtemp_c")
    public void setAvgtempC(double avgtempC) {
        this.avgtempC = avgtempC;
    }

    @JsonProperty("avgtemp_f")
    public double getAvgtempF() {
        return avgtempF;
    }

    @JsonProperty("avgtemp_f")
    public void setAvgtempF(double avgtempF) {
        this.avgtempF = avgtempF;
    }

    @JsonProperty("maxwind_mph")
    public double getMaxwindMph() {
        return maxwindMph;
    }

    @JsonProperty("maxwind_mph")
    public void setMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    @JsonProperty("maxwind_kph")
    public double getMaxwindKph() {
        return maxwindKph;
    }

    @JsonProperty("maxwind_kph")
    public void setMaxwindKph(double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    @JsonProperty("totalprecip_mm")
    public double getTotalprecipMm() {
        return totalprecipMm;
    }

    @JsonProperty("totalprecip_mm")
    public void setTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    @JsonProperty("totalprecip_in")
    public double getTotalprecipIn() {
        return totalprecipIn;
    }

    @JsonProperty("totalprecip_in")
    public void setTotalprecipIn(double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    @JsonProperty("avgvis_km")
    public double getAvgvisKm() {
        return avgvisKm;
    }

    @JsonProperty("avgvis_km")
    public void setAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    @JsonProperty("avgvis_miles")
    public double getAvgvisMiles() {
        return avgvisMiles;
    }

    @JsonProperty("avgvis_miles")
    public void setAvgvisMiles(double avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    @JsonProperty("avghumidity")
    public double getAvghumidity() {
        return avghumidity;
    }

    @JsonProperty("avghumidity")
    public void setAvghumidity(double avghumidity) {
        this.avghumidity = avghumidity;
    }

    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @JsonProperty("uv")
    public double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(double uv) {
        this.uv = uv;
    }

}
