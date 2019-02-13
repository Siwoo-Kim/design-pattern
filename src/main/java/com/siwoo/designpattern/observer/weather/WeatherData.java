package com.siwoo.designpattern.observer.weather;

import com.siwoo.designpattern.observer.subscribe.Observer;
import com.siwoo.designpattern.observer.subscribe.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

//Subject 구현 클래스.
//Observers 와 one-to-many 관계를 가지며 Observer 인터페이스를 통해 느슨한 결합(Loose Coupling) 으로 결합되어 있다.
//구현한 emit 은 Observers 들에게 해당 클래스의 상태 변화를 알린다.
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    void measurementChange() {
        setChanged();
        notifyObservers();
    };

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    };

}
