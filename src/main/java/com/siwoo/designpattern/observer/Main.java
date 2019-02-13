package com.siwoo.designpattern.observer;


import com.siwoo.designpattern.observer.weather.CurrentConditionDisplay;
import com.siwoo.designpattern.observer.weather.HeatConditionDisplay;
import com.siwoo.designpattern.observer.weather.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatConditionDisplay heatConditionDiplay = new HeatConditionDisplay(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(10.0F,  0.08F, 1.2F);
        weatherData.setMeasurements(12.0F,  0.08F, 1.2F);
        weatherData.setMeasurements(13.0F,  0.08F, 1.2F);
    }
}
