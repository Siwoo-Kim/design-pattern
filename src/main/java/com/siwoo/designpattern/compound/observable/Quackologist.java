package com.siwoo.designpattern.compound.observable;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable observable) {
        System.out.println("Quackologist: " + observable +  " just quacked.");
    }
}
