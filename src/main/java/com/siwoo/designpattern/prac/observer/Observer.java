package com.siwoo.designpattern.prac.observer;

//ref: Subject 로 부터 구독을 원할시 그 클래스는 Observer 클래스를 구현해야 한다.
//ref: 주제의 상태가 바뀌었을때 update 메서드가 실행된다.
public interface Observer {

    void update(float temperature, float humidity, float updated);

}
