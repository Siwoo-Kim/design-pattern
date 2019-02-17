package com.siwoo.designpattern.prac.observer.weather;

import com.siwoo.designpattern.prac.observer.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer, DisplayWeather {
//    private Subject subject;
    private Observable subject;
    private float temperature;
    private float humidity;

    public CurrentConditions(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println(String.format("Current condition: %10.2f F degrees and %10.2f %% humidity", temperature, humidity));
    }

//    @Override
//    public void update(float temperature, float humidity, float updated) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.temperature = ((WeatherData) o).getTemperature();
            this.humidity = ((WeatherData) o).getHumidity();
            display();
        }
    }
}
