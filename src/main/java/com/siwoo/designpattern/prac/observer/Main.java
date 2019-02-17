package com.siwoo.designpattern.prac.observer;

import com.siwoo.designpattern.prac.observer.weather.CurrentConditions;
import com.siwoo.designpattern.prac.observer.weather.DisplayWeather;
import com.siwoo.designpattern.prac.observer.weather.StatisticDisplay;
import com.siwoo.designpattern.prac.observer.weather.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayWeather current = new CurrentConditions(weatherData);
        DisplayWeather stastics = new StatisticDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
