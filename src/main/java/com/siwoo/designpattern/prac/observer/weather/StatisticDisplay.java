package com.siwoo.designpattern.prac.observer.weather;

import com.siwoo.designpattern.prac.observer.Subject;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, DisplayWeather {
//    private Subject subject;
    private Observable subject;
    private float sum;
    private float max;
    private float min;
    private float count;

    public StatisticDisplay(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

//    @Override
//    public void update(float temperature, float humidity, float updated) {
//        count++;
//        if (count == 1) {
//            this.max = this.min = this.sum = temperature;
//        } else {
//            this.max = Math.max(temperature, this.max);
//            this.min = Math.min(temperature, this.min);
//            this.sum += temperature;
//        }
//        display();
//    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            count++;
            float temp = Float.MIN_VALUE;
            if (count == 1) {
                temp = ((WeatherData) o).getTemperature();
                this.max = this.min = this.sum = temp;
            } else {
                this.max = Math.max(temp, this.max);
                this.min = Math.min(temp, this.min);
                this.sum += temp;
            }
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("Avg/Max/Min temperature = %10.2f/%10.2f/%10.2f", (sum / count), max, min));
    }
}
