package com.siwoo.designpattern.prac.observer.weather;

import com.siwoo.designpattern.prac.observer.Observer;
import com.siwoo.designpattern.prac.observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {
    private List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public void measurementsChanged() {
        //ref: java.util.Observable 메서드
        setChanged();
        notifyObservers();
    }

//    @Override
//    public void addObserver(Observer observer) {
//        observers.add(observer);
//    }
//
//    @Override
//    public void deleteObserver(Observer observer) {
//        int index = observers.indexOf(observer);
//        if (index >= 0)
//            observers.remove(index);
//    }
//    @Override
//    public void notifyObservers() {
//        for (Observer observer: observers)
//            observer.update(temperature, humidity, pressure);
//    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
