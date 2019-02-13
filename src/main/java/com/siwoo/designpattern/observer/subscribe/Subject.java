package com.siwoo.designpattern.observer.subscribe;

//Subject 인터페이스.
//Observer 을 등록하거나 해지시킨다.
//Observer 와 one (Subject) to many (Observers) 의 관계를 가진다.
public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void emit();
}
