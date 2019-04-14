package com.siwoo.designpattern.compound.strategy;


import com.siwoo.designpattern.compound.observable.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
