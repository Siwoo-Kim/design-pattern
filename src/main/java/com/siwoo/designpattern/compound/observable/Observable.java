package com.siwoo.designpattern.compound.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator itr = observers.iterator();
        while (itr.hasNext()) {
            Observer observer = (Observer) itr.next();
            observer.update(duck);
        }
    }
}
