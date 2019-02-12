package com.siwoo.designpattern.observer;

import com.siwoo.designpattern.observer.observer.CurrentCondtitions;
import com.siwoo.designpattern.observer.observer.ForecastDisplay;
import com.siwoo.designpattern.observer.observer.StatisticsDisplay;
import com.siwoo.designpattern.observer.subject.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondtitions condtitions = new CurrentCondtitions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(10.0F,  0.08F, 1.2F);
        weatherData.setMeasurements(12.0F,  0.08F, 1.2F);
        weatherData.setMeasurements(13.0F,  0.08F, 1.2F);
    }
}
