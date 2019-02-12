package com.siwoo.designpattern.observer.observer;

import com.siwoo.designpattern.observer.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay condition: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
