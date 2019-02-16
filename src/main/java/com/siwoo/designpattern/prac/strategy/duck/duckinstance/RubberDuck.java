package com.siwoo.designpattern.prac.strategy.duck.duckinstance;

import com.siwoo.designpattern.prac.strategy.duck.strategy.FlyNoWay;
import com.siwoo.designpattern.prac.strategy.duck.strategy.Mute;
import com.siwoo.designpattern.prac.strategy.duck.strategy.Quack;

public class RubberDuck extends DuckContext {

    public RubberDuck() {
        setFlyStrategy(new FlyNoWay());
        setQuackStrategy(new Mute());
    }

    @Override
    void display() {
        System.out.println("RedheadDuck");
    }
}
