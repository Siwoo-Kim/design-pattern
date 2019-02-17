package com.siwoo.designpattern.prac.observer;

//ref: 주제 (Subject) 는 구독자 옵저버(Observer)를 등록하거나 옵저버(Observer)를 탈퇴시키는 인터페이스.
public interface Subject {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();

}
