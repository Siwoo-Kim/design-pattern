package com.siwoo.designpattern.observer.subject;

import com.siwoo.designpattern.observer.observer.Observer;

//발행자 (Subject) 인터페이스. 옵저버를 등록하거나 옵저버의 탈퇴 인터페이스를 제공.
public interface Subject {

    void register(Observer observer);
    void remove(Observer observer);
    void emit();

}
