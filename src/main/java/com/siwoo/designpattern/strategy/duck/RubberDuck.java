package com.siwoo.designpattern.strategy.duck;

import com.siwoo.designpattern.strategy.behavior.FlyNoWay;
import com.siwoo.designpattern.strategy.behavior.MuteQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
}
