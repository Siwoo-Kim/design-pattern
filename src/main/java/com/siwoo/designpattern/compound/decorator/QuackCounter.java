package com.siwoo.designpattern.compound.decorator;

import com.siwoo.designpattern.compound.observable.Observer;
import com.siwoo.designpattern.compound.strategy.Quackable;

public class QuackCounter implements Quackable {
    Quackable target;
    static int numberOfQuacks;

    public QuackCounter(Quackable target) {
        this.target = target;
    }

    @Override
    public void quack() {
        target.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.target.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.target.notifyObservers();
    }
}
