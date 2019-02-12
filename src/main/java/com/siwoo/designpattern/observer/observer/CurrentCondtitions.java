package com.siwoo.designpattern.observer.observer;

import com.siwoo.designpattern.observer.subject.Subject;

public class CurrentCondtitions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentCondtitions(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void display() {
        //뷰의 다형성을 위해 나중에 MVC 패턴을 사용할 수 있다.
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
