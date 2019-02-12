package com.siwoo.designpattern.observer.subject;

import com.siwoo.designpattern.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        emit();
    };

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0)
            observers.remove(index);
    }

    @Override
    public void emit() {
        for (Observer o: observers) {
            o.update(temperature, humidity, pressure);
        }
    }


}
