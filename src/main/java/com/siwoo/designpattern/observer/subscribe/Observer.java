package com.siwoo.designpattern.observer.subscribe;

//Observer 인터페이스.
//Subject 로부터 구독하기 위해서는 이 인테페이스를 구현해야 된다.
//Subject 의 상태가 바뀌면 subscribe 메서드가 호출된다.
public interface Observer {

    void subscribe(float temperature, float humidity, float pressure);

}
