package com.siwoo.designpattern.observer.observer;


//Subject 발행자에게 update 된 데이터 update 메서드를 통해 구독받는다.
public interface Observer {

    void update(float temperature, float humidity, float pressure);

}
