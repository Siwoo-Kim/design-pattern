package com.siwoo.designpattern.observer.weather;

import com.siwoo.designpattern.observer.subscribe.Subject;

import java.util.Observable;
import java.util.Observer;

//Observer 을 구현한 클래스.
//Subject 와 일대다의 관계를 가지며 interface 을 통한 느슨한 결합(Loose Coupling) 으로 결합되어 있다.
//Subject 의 상태가 변하면 subscribe 메서드가 호출된다.
public class CurrentConditionDisplay implements Observer, WeatherDisplay {
    private float temperature;
    private float humidity;
    private Observable subject;
//    private Subject subject;

    public CurrentConditionDisplay(Observable subject) {
        this.subject = subject;
        //ref: Request for subscription
        this.subject.addObserver(this);
    }

//    //ref: get subscription
//    @Override
//    public void subscribe(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
