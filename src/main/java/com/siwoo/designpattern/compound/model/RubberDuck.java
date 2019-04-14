package com.siwoo.designpattern.compound.model;

import com.siwoo.designpattern.compound.observable.Observable;
import com.siwoo.designpattern.compound.observable.Observer;
import com.siwoo.designpattern.compound.strategy.Quackable;

public class RubberDuck implements Quackable {
    private Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
