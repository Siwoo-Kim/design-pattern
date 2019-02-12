package com.siwoo.designpattern.observer.observer;

import com.siwoo.designpattern.observer.subject.Subject;

/**
 * Created by sm123tt@gmail.com on 2019-02-12
 * Project: design-pattern
 * Github : http://github.com/Siwoo-Kim
 */

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void display() {
        System.out.println("ForeacastDisplay condition: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
