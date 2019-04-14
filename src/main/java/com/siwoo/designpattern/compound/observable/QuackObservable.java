package com.siwoo.designpattern.compound.observable;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();

}
